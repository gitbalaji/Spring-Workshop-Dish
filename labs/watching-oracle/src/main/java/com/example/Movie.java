package com.example;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {
    @Id
    @SequenceGenerator(
        name="ID_SEQUENCE_GENERATOR",
        sequenceName="ID_SEQ"
    )
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQUENCE_GENERATOR")
    private long id;

    private String title;

    private String year;

    private String rated;

    private String released;

    private String runtime;

    private String genre;

    public Movie() {
    }

    public Movie(String title, String year, String rated, String released, String runtime, String genre) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", year='" + year + '\'' +
            ", rated='" + rated + '\'' +
            ", released='" + released + '\'' +
            ", runtime='" + runtime + '\'' +
            ", genre='" + genre + '\'' +
            '}';
    }
}
