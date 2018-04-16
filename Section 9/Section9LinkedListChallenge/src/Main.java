import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album ("Złote przeboje");
        album1.newSong ("Kawa",3.2);
        album1.newSong ("Tak czy nie",1.2);
        album1.newSong ("Pink",3.5);

        Album album2 = new Album ("2");
        album2.newSong ("Mix",3.2);
        album2.newSong ("Remix",1.2);
        album2.newSong ("Turbo",1.0);

        album1.printAlbum ("Złote przeboje");
        album2.printAlbum ("2");

    //    System.out.println ( album1.getSongArrayList ().get (0).getTitle ());
        LinkedList<Song> playlist = new LinkedList<> ();
        album2.addToPlaylist (1,playlist);
        album1.addToPlaylist (2,playlist);
        album2.addToPlaylist (3,playlist);

        album1.printPlaylist (playlist);
    }
}
