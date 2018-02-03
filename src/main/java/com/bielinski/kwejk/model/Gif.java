package com.bielinski.kwejk.model;

public class Gif {
    private String name;
    private String username;
    private boolean favourite;

    public Gif(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getThymeleafFilePatch() {
        String string = "/gifs/" + getName() + ".gif";
        return string;
    }
}

