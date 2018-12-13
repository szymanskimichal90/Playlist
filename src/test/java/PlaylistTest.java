import org.junit.Test;

import static org.junit.Assert.*;

public class PlaylistTest {

    Playlist mainPlst = new Playlist();
    Playlist secondPlst = new Playlist();
    Track track1 = new Music("This Love", "ATB");
    Track track2 = new Music("Trójkąty i kwadraty", "Podsiadło");
    Track track3 = new Music("Majteczki w kropeczki", "Akcent");
    Track track4 = new Music("I will fly with you", "Deagostino");
    Track track5 = new Movie("Titanic", "Spielberg");
    Track track6 = new Movie("Miś", "Bareja");



    @Test
    public void addTrackToPlstTest() {
        secondPlst.addTrackToPlst(track1);
        secondPlst.addTrackToPlst(track2);
        mainPlst.addTrackToPlst(track3);
        mainPlst.addTrackToPlst(track4);
        mainPlst.addTrackToPlst(track5);
        mainPlst.addTrackToPlst(secondPlst);

    }

    @Test
    public void checkIfPlaylistPlay(){
        secondPlst.addTrackToPlst(track1);
        secondPlst.addTrackToPlst(track2);
        mainPlst.addTrackToPlst(track3);
        mainPlst.addTrackToPlst(track4);
        mainPlst.addTrackToPlst(track5);
        mainPlst.addTrackToPlst(secondPlst);

        secondPlst.playAsAdded();
        mainPlst.playAsAdded();
    }
}