package com.example.mrpeter1.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing = true;
    public void fade(View view){

        Log.i("info","imageview tapped");
        ImageView bartgambar = (ImageView) findViewById(R.id.bartgambar);
        ImageView homergambar = (ImageView) findViewById(R.id.homergambar);
        bartgambar.animate().alpha(0).setDuration(2000);
        homergambar.animate().alpha(1).setDuration(2000);

        if (bartIsShowing){

            bartIsShowing= false;
            bartgambar.animate().alpha(0).setDuration(2000);
            homergambar.animate().alpha(1).setDuration(2000);
        } else {

            bartIsShowing= true;
            bartgambar.animate().alpha(1).setDuration(2000);
            homergambar.animate().alpha(0).setDuration(2000);
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
