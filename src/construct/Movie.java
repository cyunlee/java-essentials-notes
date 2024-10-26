package construct;

public class Movie {
    String title;
    String director;
    int runningHour;

    Movie(String title, String director) {
        this(title, director, 2);
    }
    Movie(String title, String director, int runningHour) {
        this.title = title;
        this.director = director;
        this.runningHour = runningHour;

    }
}
