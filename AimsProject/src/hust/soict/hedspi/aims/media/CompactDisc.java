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
    public void play() throws PlayerException{
        if(this.getLength() > 0) {
// TODO Play all tracks in the CD as you have implemented
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength());
            for (Track track : tracks) {
                try {
                    track.play();
                } catch (PlayerException e) {
                    e.printStackTrace();
                }
            }
        }else {
            throw new PlayerException("ERROR: CD length is non-positive!"); }
    }

    // test đa hình
    @Override
    public String toString() {
        String print = String.format("%-5s%-5s%-5s%-5s%-5s", getId(), getTitle(),getCategory() , getCost(), getDirector());
        return print ;
    }
}
