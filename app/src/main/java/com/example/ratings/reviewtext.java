package com.example.ratings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class reviewtext extends AppCompatActivity {
    /**
     * Focus here that even after you made enabled the parent connection, you are still able to work properly on the emulator so,
     * don't be scared about that since we need the reviews to be displayed here we are using the indent to create a connection and
     * retrieving the value through getfloatextra using the key that we assigned before with the default star rating
     * Here you use Text View because you want to concatenate with the text that you already have
     * But you want to go back to the windows and not the mainactivity again then you call the finish method in the first activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewtext);
        Intent caller = getIntent();
        float rating= caller.getFloatExtra("nbstars",0);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Welcome to second activity! Your rating was: "+rating);


    }
}
