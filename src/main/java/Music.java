import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor

public class Music implements Track {
    @Getter
    @Setter

    private String title;
    private String author;

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
