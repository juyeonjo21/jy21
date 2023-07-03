package oop.constructor2;

public class Music {
	String song;
	String singer;
	String album;
	int play;
	int like;
	
	Music(String song, String singer, String album ){
		this.song = song;
		this.singer = singer;
		this.album = album;
	}
	Music(int play, int like){
		this.play = play;
		this.like = like;
	}
	void setPlay(int play) {
		if(play >= 0 && play >= 100000 ) {
		this.play = play;
		}
	}
	void setLike(int like) {
		if(like >= 0 && like >= 100000 ) {
			this.like = like;
		}
		
		
	
	
}

		
	}
	
	
	
