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
public class Album {
    private String id_album;
    private String name;
    private String description;
    ArrayList<Song> songs = new ArrayList<>();
    public Album() {
    }

    public Album(String id_album, String name, String description) {
        this.id_album = id_album;
        this.name = name;
        this.description = description;
    }

    public String getId_album() {
        return id_album;
    }

    public void setId_album(String id_album) {
        this.id_album = id_album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    
}
