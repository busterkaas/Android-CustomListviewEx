package com.example.buster.mycustomlistview;

/**
 * Created by Buster on 26-02-2016.
 */
public class Song {

    private int bpm, year;
    private String artist, title;

    public Song(int bpm, int year, String artist, String title){
        this.bpm = bpm;
        this.year = year;
        this.artist = artist;
        this.title = title;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
