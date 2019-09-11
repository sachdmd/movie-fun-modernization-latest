package org.superbiz.moviefun.albumsapi;

import org.superbiz.moviefun.moviesapi.MovieInfo;

import java.util.Objects;

public class AlbumInfo {

    /*@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long id;

    private String artist;

    public AlbumInfo(String artist, String title, int year, int rating) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public AlbumInfo() {
    }

    public AlbumInfo(long id, String artist, String title, int year, int rating) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private int year;
    private int rating;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlbumInfo)) return false;
        AlbumInfo albumInfo = (AlbumInfo) o;
        return getId() == albumInfo.getId() &&
                getYear() == albumInfo.getYear() &&
                getRating() == albumInfo.getRating() &&
                Objects.equals(getArtist(), albumInfo.getArtist()) &&
                Objects.equals(getTitle(), albumInfo.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getArtist(), getTitle(), getYear(), getRating());
    }
}