package com.example.faisal.booklist;

import java.util.ArrayList;

/**
 * Created by Faisal on 05/07/2017.
 */

public class TopBooks {

    private ArrayList<Book> list;

    public TopBooks() {
        list = new ArrayList<Book>();
        list.add(new Book(1, "The Name of the Wind", "Patrick Rothfuss"));
        list.add(new Book(2, "Half a King", "Joe Abercrombie"));
        list.add(new Book(3, "The Magicians", "Lev Grossman"));
        list.add(new Book(4, "The Lies of Locke Lamora", "Scott Lynch"));
        list.add(new Book(5, "Ender's Game", "Orson Scott"));
        list.add(new Book(6, "The First Law", "Joe Abercrombie"));
        list.add(new Book(7, "Liveship Traders", "Robin Hobb"));
        list.add(new Book(8, "Broken Empire", "Mark Lawrence"));
        list.add(new Book(9, "The Wheel of Time", "Robert Jordan"));
        list.add(new Book(10, "Inheritance Cycle", "Christopher Paolini"));
    }

    public ArrayList<Book> getList() {
        return new ArrayList<Book>(list);
    }
    
}
