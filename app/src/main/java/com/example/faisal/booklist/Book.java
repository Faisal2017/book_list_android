package com.example.faisal.booklist;

/**
 * Created by Faisal on 05/07/2017.
 */

public class Book {

    private int ranking;
    private String name;
    private String author;

    public Book(Integer ranking, String name, String author) {
        this.ranking = ranking;
        this.name = name;
        this.author = author;
    }

    public Integer getRanking() { return this.ranking; }

    public String getName() { return this.name; }

    public String getAuthor() { return this.author; }

}
