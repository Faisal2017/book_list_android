package com.example.faisal.booklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import java.util.ArrayList;

public class TopBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_list);

        TopBooks topBooks = new TopBooks();

        ArrayList<Book> list = topBooks.getList();

        TopBooksAdapter bookAdapter = new TopBooksAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(bookAdapter);
    }
}
