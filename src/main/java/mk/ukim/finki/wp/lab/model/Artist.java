package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Artist {
    private Long id;
    private String firstName;
    private String lastName;
    private String bio;
    private List<Song> songs;

    public Artist(String firstName, String lastName, String bio, List<Song> songs) {
        this.id = (long) (Math.random() * 1000);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.songs = songs;
    }
}
