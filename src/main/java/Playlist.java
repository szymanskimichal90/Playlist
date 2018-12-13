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
    private List<Track> playlist = new ArrayList<>();


    void addTrackToPlst(Track track) {
        playlist.add(track);
    }

    public void setHowToPlay(TypeOfPlay toPlay) {
        if (toPlay == TypeOfPlay.RANDOM) {
            Collections.shuffle(playlist);
        }
        else if (toPlay == TypeOfPlay.LOOPED) {
            playlist.add((Track) playlist);}
           else if (toPlay == TypeOfPlay.SEQUENTIAL) {
                Collections.unmodifiableList(playlist);
            }

        }

    }

    @Override
    public void play() {
        System.out.println("You are listening whole playlist. Name:" + name);
        for (Track t : playlist
        ) {
            t.play();

        }
    }
}
