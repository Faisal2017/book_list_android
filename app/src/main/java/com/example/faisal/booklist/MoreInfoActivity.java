package com.example.faisal.booklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoreInfoActivity extends AppCompatActivity {

    TextView more_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        more_info = (TextView) findViewById(R.id.more_info);

        Intent intent = getIntent();
    }


}
