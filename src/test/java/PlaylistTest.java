import org.junit.Test;

import static org.junit.Assert.*;

public class PlaylistTest {

    Playlist mainPlst = new Playlist("Main playlist");
    Playlist secondPlst = new Playlist("Second playlist");
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

        secondPlst.play();

        System.out.println("-------------");
        mainPlst.play();
    }

    @Test
    public void checkIfPlaylistIsSortedProperly(){
//        Track track1 = new Music("This Love", "ATB");
//        Track track2 = new Music("Trójkąty i kwadraty", "Podsiadło");
//        Track track3 = new Music("Majteczki w kropeczki", "Akcent");
//        Track track4 = new Music("I will fly with you", "Deagostino");
//        Track track5 = new Movie("Titanic", "Spielberg");
//        Track track6 = new Movie("Miś", "Bareja");
        secondPlst.addTrackToPlst(track1);
        secondPlst.addTrackToPlst(track2);
        secondPlst.addTrackToPlst(track5);
        mainPlst.addTrackToPlst(track3);
        mainPlst.addTrackToPlst(track4);
        mainPlst.addTrackToPlst(track5);
        mainPlst.addTrackToPlst(secondPlst);
        secondPlst.play();
        System.out.println("LOOPED");
        secondPlst.setHowToPlay(TypeOfPlay.LOOPED);
        secondPlst.play();
        System.out.println("RANDOM");
        secondPlst.setHowToPlay(TypeOfPlay.RANDOM);
        secondPlst.play();
        System.out.println("SEQUENTIAL");
        secondPlst.setHowToPlay(TypeOfPlay.SEQUENTIAL);
        secondPlst.play();
        System.out.println("RANDOM");
        secondPlst.setHowToPlay(TypeOfPlay.RANDOM);
        secondPlst.play();
        System.out.println("MAIN PLAYLIST");
        mainPlst.play();
    }
}