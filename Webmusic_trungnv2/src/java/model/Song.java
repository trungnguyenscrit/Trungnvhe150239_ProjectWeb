/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Trung
 */
public class Song {
    private String id_song;
    private String name;
    private String poster;
    private String linksong;
    private String description;
    ArrayList<Singer> singers = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public Song() {
    }

    public Song(String id_song, String name, String poster, String linksong, String description) {
        this.id_song = id_song;
        this.name = name;
        this.poster = poster;
        this.linksong = linksong;
        this.description = description;
    }

    public String getId_song() {
        return id_song;
    }

    public void setId_song(String id_song) {
        this.id_song = id_song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getLinksong() {
        return linksong;
    }

    public void setLinksong(String linksong) {
        this.linksong = linksong;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Singer> getSingers() {
        return singers;
    }

    public void setSingers(ArrayList<Singer> singers) {
        this.singers = singers;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

}