import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    String albumName;
    ArrayList<Song> songArrayList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songArrayList = new ArrayList<Song> ( );
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public boolean newSong(String title, double duration) {
        this.songArrayList.add (new Song (title, duration));
        return true;
    }

    public boolean printAlbum(String albumName) {
        System.out.println ("Album name: " + getAlbumName ( ));
        for (int i = 0; i < this.songArrayList.size ( ); i++) {
            System.out.println ((i + 1) + ". "
                    + this.songArrayList.get (i).getTitle ( ) + " "
                    + this.songArrayList.get (i).getDuration ( ) + "min");
        }
        System.out.println ("===============");

        return true;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {

        playlist.add (this.songArrayList.get (trackNumber - 1));
        return true;

    }

    public boolean  printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> i = playlist.iterator ();
        while(i.hasNext ()){
            System.out.println ("Playlist song: " + i.next ().getTitle () );
        }return true;
    }

//    public static void main(String[] args) {
//        pr
//    }
}
