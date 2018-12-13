import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist implements Track {
    @Getter
    @Setter
    private List<Track> playlist = new ArrayList<>();

    void addTrackToPlst(Track track) {
        playlist.add(track);
    }

    void playAsAdded (){
        for (Track t:playlist
             ) {
            System.out.println(t);

        }
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlist=" + playlist +
                '}';
    }
}
