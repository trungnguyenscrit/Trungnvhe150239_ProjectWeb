/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Trung
 */
public class Singer {
    private String id_singer;
    private String name;
    private String poster;
    private String description;

    public Singer() {
    }

    public Singer(String id_singer, String name, String poster, String description) {
        this.id_singer = id_singer;
        this.name = name;
        this.poster = poster;
        this.description = description;
    }

    public String getId_singer() {
        return id_singer;
    }

    public void setId_singer(String id_singer) {
        this.id_singer = id_singer;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
