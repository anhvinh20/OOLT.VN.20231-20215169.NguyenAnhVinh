package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }
    public CompactDisc(int id, String title, String category, float cost, String director, ArrayList<Track> tracks) {
        super(id, title, category, cost, director);
        this.tracks = new ArrayList<>(tracks);
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list.");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track isn't in the list.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    public ArrayList<Track> getTracks() {
        return tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength());

        // Loop through each track and play
        for (Track track : tracks) {
            track.play();
        }
    }


    // test đa hình
    @Override
    public String toString() {
        String print = String.format("%-15s%s%s", getArtist(), getTitle() , getCost());
        return print ;
    }
}
