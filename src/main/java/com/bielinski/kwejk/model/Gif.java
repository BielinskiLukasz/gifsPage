package com.bielinski.kwejk.model;

public class Gif {
    private String name;
    private String username;
    private boolean favorite;

    public Gif(String name) {
        this.name = name;
    }

    public Gif(String name, boolean favorite) {
        this.name = name;
        this.favorite = favorite;
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

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favourite) {
        this.favorite = favourite;
    }

    public String getThymeleafFilePatch() {
        String string = "/gifs/" + getName() + ".gif";
        return string;
    }
}

