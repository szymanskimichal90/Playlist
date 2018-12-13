import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter

public class Playlist implements Track {

    public Playlist(String name) {
        this.name = name;
    }

    private String name;
    private Set<Track> playlist = new LinkedHashSet<Track>();

    void addTrackToPlst(Track track) {
        playlist.add(track);
    }



    @Override
    public void play() {
        System.out.println("You are listening whole playlist. Name:"+name);
        for (Track t:playlist
        ) {
            t.play();

        }
    }
}
