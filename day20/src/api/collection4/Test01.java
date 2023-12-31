package api.collection4;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		//이용방법이 정해져 있는 저장소
		//stack -> 이력을 관리하는데에 최적화
		Stack<String> stack = new Stack<>();
		
		//추가
		stack.push("구글");
		stack.push("네이버"); //add랑도 비슷하지만 stack은 push로 씀
		stack.push("카카오");
		stack.push("KH정보교육원");
		
		//확인
		System.out.println(stack.peek()); //지금 가장 최신 데이터가 무엇이니
		
		//제거
		stack.pop();
		System.out.println(stack.peek());
		
		//System.out.println(stack);
	}
}
