package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class Song {
    private Long id;
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers;
    private Optional<Album> album;

    private static Long idCounter = 1L;

    public Song(String title, String trackId, String genre, int releaseYear, List<Artist> performers, Optional<Album> album) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers;
        this.album = album;
        this.id = idCounter++;
    }
}
