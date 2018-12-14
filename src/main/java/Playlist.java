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
    private List<Track> copyOfPlaylist = new ArrayList<>();


    void addTrackToPlst(Track track) {
        copyOfPlaylist.add(track);
        playlist.add(track);
    }


    public void setHowToPlay(TypeOfPlay toPlay) {

        if (toPlay == TypeOfPlay.RANDOM) {
            playlist = new ArrayList<>();
            copyTrackToPlaylist();
            Collections.shuffle(playlist);
        } else if (toPlay == TypeOfPlay.LOOPED) {
            playlist = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                copyTrackToPlaylist();
            }
        } else if (toPlay == TypeOfPlay.SEQUENTIAL) {
            playlist = new ArrayList<>();
            copyTrackToPlaylist();
        }
    }

    private void copyTrackToPlaylist() {
        for (int j = 0; j < copyOfPlaylist.size(); j++) {
            playlist.add(copyOfPlaylist.get(j));
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
