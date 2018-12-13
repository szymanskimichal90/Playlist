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
    public void play() {
        System.out.println("MUSIC is playing so loud. Singer: " + author + ", Title:" + title);
    }
}
