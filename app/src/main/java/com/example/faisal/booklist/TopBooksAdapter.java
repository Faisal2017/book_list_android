package com.example.faisal.booklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.faisal.booklist.R.id.parent;

/**
 * Created by Faisal on 05/07/2017.
 */

public class TopBooksAdapter extends ArrayAdapter<Book> {

    public TopBooksAdapter(Context context, ArrayList<Book> list) {

        super(context, 0, list);
    }


        public View getView(int position, View listItemView, ViewGroup parent) {

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.books_item, parent, false);
            }

            Book currentBook = getItem(position);

            TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
            ranking.setText(currentBook.getRanking().toString());

            TextView name = (TextView) listItemView.findViewById(R.id.name);
            name.setText(currentBook.getName().toString());

            TextView author = (TextView) listItemView.findViewById(R.id.author);
            author.setText(currentBook.getAuthor().toString());

            listItemView.setTag(currentBook);

            return listItemView;
        }


}
