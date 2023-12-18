package com.example.calendar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    @DateTimeFormat
    private Date startime;
    private Date endtime;
    private String reminder;

    public Event(Long id, String title, String description, String location, Date startime, Date endtime, String reminder){

        this.id=id;
        this.title=title;
        this.description=description;
        this.location=location;
        this.startime=startime;
        this.endtime=endtime;
        this.reminder=reminder;

    }

    public Event() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getStartTime() {
        return null;
    }

    public Object getEndTime() {
        return null;
    }


    public void setEndTime(Object endTime) {
    }

    public void setStartTime(Object startTime) {
    }
}

