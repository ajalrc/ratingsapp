package com.example.ratings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    /**
     * Here toast is to get the value that the user chose
     * @param savedInstanceState
     * LENGTH_SHORT means that the context will be displayed for the shorter amount of time
     * getApplicationContext() get the context for all the activity happening in the code, since we have only one ativity that is enough for us.
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Here you have toast message before to see some output in the scree but if you want the same output but
     * in different activity file, you do some action so, lets comment the toast method.
     * Intent here represents for an operation to perform which in our case is opening a second activity
     * where here the start activity is indicating what to do when called
     *look at the putextra and what that is doing is since we need to pass the rating from this activity to another
     * it is saving the rating value in an id name "nbstars" which we will call in another activity.
     */
    public void enter(View v){
        Log.i("Tag_I_made_up","I am here!");
        RatingBar ratingBar=findViewById(R.id.ratingBar);
        float rating=ratingBar.getRating();//here this will get the input but interms of floating point number
//        Toast.makeText(getApplicationContext(),
//                rating +"stars",
//                Toast.LENGTH_SHORT).show();
        Intent gotosecond= new Intent();
        gotosecond.putExtra("nbstars",rating);
        gotosecond.setClass(this,reviewtext.class);
        startActivity(gotosecond);
        finish();


    }
}
