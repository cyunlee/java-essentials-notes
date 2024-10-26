package access.ex;

public class PlayListMain {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        Song song1 = new Song("좋은 날", "아이유", "K팝");
        Song song2 = new Song("보헤미안 랩소디", "퀸", "POP");

        playList.addSong(song1);
        playList.addSong(song2);

        playList.displaySong();
    }
}
