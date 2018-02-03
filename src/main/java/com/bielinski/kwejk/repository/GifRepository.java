package com.bielinski.kwejk.repository;

import com.bielinski.kwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifRepository {
    private static List<Gif> ALL_GIFS = new ArrayList<>();

    static {
        ALL_GIFS.add(new Gif("android-explosion"));
        ALL_GIFS.add(new Gif("ben-and-mike"));
        ALL_GIFS.add(new Gif("book-dominos"));
        ALL_GIFS.add(new Gif("compiler-bot"));
        ALL_GIFS.add(new Gif("cowboy-coder"));
        ALL_GIFS.add(new Gif("infinite-andrew"));
    }

    public List<Gif> findAll() {
        return ALL_GIFS;
    }
}
