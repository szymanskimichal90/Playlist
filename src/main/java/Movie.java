import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

public class Movie implements Track {
    @Getter
    @Setter

    private String title;
    private String director;


    @Override
    public void play() {
        System.out.println("MOVIE is plaing. Title: " + title + ", Director: " + director);

    }
}
