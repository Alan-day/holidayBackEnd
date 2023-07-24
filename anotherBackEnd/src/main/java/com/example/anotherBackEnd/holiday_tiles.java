package com.example.anotherBackEnd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class holiday_tiles {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String picture;

    private String description_tile;
    public int getId() {
        return id;
    }

    public holiday_tiles(int id, String picture, String description_tile) {
        this.id = id;
        this.picture = picture;
        this.description_tile = description_tile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription_tile() {
        return description_tile;
    }

    public void setDescription_tile(String description_tile) {
        this.description_tile = description_tile;
    }





}


