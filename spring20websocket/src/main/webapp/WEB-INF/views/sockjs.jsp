<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>SockJS를 적용한 웹소켓 예제</h1>
    
    <input type="text" class="message-input">
    <button type="button" class="send-btn">전송</button>
    
    <div class="client-list"></div>
    <div class="message-list"> </div>
    
    
    
    <!--  웹소켓 서버가 SockJS일 경우 페이지에서도 SockJS를 사용해야 한다  -->
    <!-- SockJS cdn -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.6.1/sockjs.min.js"></script>
    <!-- JQuery cdn -->
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    
    
     <script>
     //연결 생성
     //window.socket = new WebSocket(주소); //ws로 시작하는 주소(기존)
     window.socket = new SockJS("${pageContext.request.contextPath}/ws/sockjs"); //http로 시작하는 주소
     //연결 후 해야 할 일들을 콜백함수로 지정(onopen, onclose, onerror, onmessage)
     window.socket.onmessage = function(e){
    	 //console.log(e);
    	 var data = JSON.parse(e.data);
    	 //console.log(data);
    	 
    	 //사용자가 접속하거나 종료했을 때 서버에서 오는 데이터로 목록을 갱신
    	 //사용자가 메세지를 보냈을 때 서버에서 이를 전체에게 전달한다
    	 //data.clents 에 회원 목록이 있다
    	 if(data.clients){ //true냐(있냐) - 목록 처리
    	 $(".client-list").empty();
    	 for(var i=0; i < data.clients.length; i++){
    		 $("<div>").text(data.clients[i].memberId).appendTo(".client-list");  		 
    	 }
    	}
    	 else if(data.content){//메세지 처리
    		var memberId = $("<div>").text(data.memberId);
     		var memberLevel = $("<div>").text(data.memberLevel);
     		var content = $("<div>").text(data.content);
     		
     		$("<div>").append(memberId)
     				  .append(memberLevel)
     				  .append(content)
     				  .appendTo(".message-list"); 
    	}
     };
     
     $(".send-btn").click(function(){
    	 var text = $(".message-input").val();
    	 if(text.length == 0) return;
    	 
    	 window.socket.send(text);
    	 $(".messgae-input").val("");
     });
     </script>
     
     