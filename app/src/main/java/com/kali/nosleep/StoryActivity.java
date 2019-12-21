package com.kali.nosleep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    String title, author, story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        getSupportActionBar().hide();

        if (getIntent() != null){
            title = getIntent().getStringExtra("title");
            author = getIntent().getStringExtra("author");
            story = getIntent().getStringExtra("story");
        }

        TextView t = findViewById(R.id.titleOfStory);
        TextView a = findViewById(R.id.autohorOfStory);
        TextView s = findViewById(R.id.storyOfStory);

        t.setText(title);
        a.setText("By "+author);
        s.setText(story);

        TextView back = findViewById(R.id.goback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
