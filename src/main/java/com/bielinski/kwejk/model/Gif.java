package com.bielinski.kwejk.model;

public class Gif {
    private String name;
    private String username;
    private boolean favorite;
    private int categoryId;

    public Gif(String name) {
        this.name = name;
    }

    public Gif(String name, boolean favorite) {
        this(name);
        this.favorite = favorite;
    }

    public Gif(String name, boolean favorite, int categoryId) {
        this(name, favorite);
        this.categoryId = categoryId;
    }

    public Gif(String name, boolean favorite, int categoryId, String username) {
        this(name, favorite, categoryId);
        this.username = username;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getThymeleafFilePatch() {
        String string = "/gifs/" + getName() + ".gif";
        return string;
    }
}

