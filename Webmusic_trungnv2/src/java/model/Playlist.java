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
public class Playlist {
    private int id_playlist;
    private String name_playlist;
    private String description;
    private int id_usercreate;
    private String poster;
    ArrayList<Song> songs = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(int id_playlist, String name_playlist, String description, int id_usercreate, String poster) {
        this.id_playlist = id_playlist;
        this.name_playlist = name_playlist;
        this.description = description;
        this.id_usercreate = id_usercreate;
        this.poster = poster;
    }

    public int getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    public String getName_playlist() {
        return name_playlist;
    }

    public void setName_playlist(String name_playlist) {
        this.name_playlist = name_playlist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_usercreate() {
        return id_usercreate;
    }

    public void setId_usercreate(int id_usercreate) {
        this.id_usercreate = id_usercreate;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
    
    
}
