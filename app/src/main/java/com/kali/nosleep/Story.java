package com.kali.nosleep;

public class Story {
    String author,readtime,story,title;

    public Story(String author, String readtime, String story, String title) {
        this.author = author;
        this.readtime = readtime;
        this.story = story;
        this.title = title;
    }

    public Story() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReadtime() {
        return readtime;
    }

    public void setReadtime(String readtime) {
        this.readtime = readtime;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

