package oop.constructor2;

public class Music2 {
	//멤버 필드 - 데이터
	String title, artist, album;
	long play;
	int like;
	
	//멤버 메소드 -코드
	void setTitle(String title) {
		this.title = title;
	}
	void setArtist(String artist) {
		this.artist = artist;
	}
	void setAlbum(String album) {
		this.album = album;
	}
	void setPlay(long play) {
		if(play < 0L ) return;
		this.play = play;
	}
	void setLike(int like) { 
		if(like < 0 ) return;
		this.like = like;
}
	String getTitle() {
		return this.title;
	}
	String getArtist() {
		if(this.artist == null ) {
			return "Various artist";
		}
		else {
			return this.artist;			
		}
	}
	String getAlbum() {
		return this.album;
	}
	long getPlay() {
		return this.play;
	}
	int getLike() {
		return this.like;
	}
	String getBest() {
		if(this.play > 100000L) {
			return "(베스트)";
		}
		else {
			return" ";
		}
	}
	String getHot() {
		if(this.like > 100000) {
			return "(인기곡)";
	}
		else {
			return" ";
		}
	}
	long getRankPoint() {
		return this.play * 2 + this.like / 2;
	}

	//생성자 - 초기화
	Music2(String title, String artist, String album){
		this(title, artist, album, 0L, 0);
	}
	Music2(String title, String artist, String album, long play, int like){
		this.setTitle(title);
		this.setArtist(artist);
		this.setAlbum(album);
		this.setPlay(play);
		this.setLike(like);
	}
	
	void show() {
		System.out.println("<음원 정보>");
		System.out.println("제목 : " + this.getTitle() + this.getBest() + this.getHot());
		System.out.println("가수 : " + this.getArtist());
		System.out.println("앨범 : " + this.getAlbum());
		System.out.println("재생 수 : " + this.getPlay());
		System.out.println("좋아요 수 : " + this.getLike());
		System.out.println("랭킹 포인트 : " + this.getRankPoint());

	
	}
}

		
	
	
	
	
