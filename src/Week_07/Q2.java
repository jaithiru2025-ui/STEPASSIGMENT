package Week_7;

import java.util.Arrays;

class Playlist {
    private final String[] songs;
    private int songCount;

    Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    void addSong(String title) {
        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        }
    }

    String[] getSongs() {
        // Return a copy so callers can't mutate the real internal array
        return Arrays.copyOf(songs, songCount);
    }

    int getSongCount() {
        return songCount;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println("Before hack: " + Arrays.toString(copy));

        copy[0] = "Hacked";
        System.out.println("After modifying the copy: " + Arrays.toString(copy));
        System.out.println("Playlist's real songs: " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}