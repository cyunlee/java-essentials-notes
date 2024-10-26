package access.ex;

public class Song {
    private String title;
    private String singer;
    private String genre;

    public Song(String title, String singer, String genre){
        this.title = title;
        this.singer = singer;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getGenre() {
        return genre;
    }
}
