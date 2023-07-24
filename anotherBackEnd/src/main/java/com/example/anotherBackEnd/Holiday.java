package com.example.anotherBackEnd;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int holiday_id;


    private String description;
    public Holiday() {
        // Empty default constructor
    }

    public Holiday(int holiday_id, String description, String date_started, String date_ended) {
        this.holiday_id = holiday_id;
        this.description = description;
        this.date_started = date_started;
        this.date_ended = date_ended;
    }

    private String date_started;

    private String date_ended;




    public int getHoliday_id() {
        return holiday_id;
    }

    public void setHoliday_id(int holiday_id) {
        this.holiday_id = holiday_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate_started() {
        return date_started;
    }

    public void setDate_started(String date_started) {
        this.date_started = date_started;
    }

    public String getDate_ended() {
        return date_ended;
    }

    public void setDate_ended(String date_ended) {
        this.date_ended = date_ended;
    }










}
