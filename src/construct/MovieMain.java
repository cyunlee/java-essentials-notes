package construct;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1 = new Movie("타이타닉", "제임스 카메론", 3);
        Movie movie2 = new Movie("기생충", "봉준호");

        Movie[] movies = new Movie[]{movie1, movie2};

        for (Movie m : movies) {
            System.out.println("제목: " + m.title + " 감독: " + m.director + " 시간: " + m.runningHour);
        }
    }
}
