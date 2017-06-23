package com.example.rishabh.event;

/**
 * Created by aniket sharma on 21-06-2017.
 */

public class Post {
    private String location;
    private String description;
    private  String name;
    private  String tag;
    private String datetime;
    private int going;

    public Post(String location, String description, String name, String tag, String datetime, int going) {
        this.location = location;
        this.description = description;
        this.name = name;
        this.tag = tag;
        this.datetime = datetime;
        this.going = going;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getGoing() {
        return going;
    }

    public void setGoing(int going) {
        this.going = going;
    }
}
