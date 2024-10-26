package access.ex;

public class PlayList {

    private Song[] songs = new Song[10];
    private int songCount;

    public void addSong(Song song){
        if(songCount>=10){
            System.out.println("뮤직 플레이어가 가득 찼습니다.");
            return;
        }
        songs[songCount++] = song;
    }

    public void displaySong(){
        System.out.println("플레이 리스트를 출력합니다.");
        for(int i=0; i<songCount; i++){
            System.out.println("제목: " + songs[i].getTitle() + " 가수: " + songs[i].getSinger() + " 장르: " + songs[i].getGenre());
        }
    }
}
