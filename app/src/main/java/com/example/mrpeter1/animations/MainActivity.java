package com.example.mrpeter1.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing = true;
//    public void fade(View view){
//
//        Log.i("info","imageview tapped");
//        ImageView bartgambar = (ImageView) findViewById(R.id.bartgambar);
//        ImageView homergambar = (ImageView) findViewById(R.id.homergambar);
//        bartgambar.animate().alpha(0).setDuration(2000);
//        homergambar.animate().alpha(1).setDuration(2000);
//
//        if (bartIsShowing){
//
//            bartIsShowing= false;
//            bartgambar.animate().alpha(0).setDuration(2000);
//            homergambar.animate().alpha(1).setDuration(2000);
//        } else {
//
//            bartIsShowing= true;
//            bartgambar.animate().alpha(1).setDuration(2000);
//            homergambar.animate().alpha(0).setDuration(2000);
//        }
//
//
//    }

    // ---------------------------------------------------------------
    public void fade(View view){

        Log.i("info","imageview tapped");
        ImageView bartgambar = (ImageView) findViewById(R.id.bartgambar);
        ImageView homergambar = (ImageView) findViewById(R.id.homergambar);
//        bartgambar.animate().alpha(0).setDuration(2000);
//        homergambar.animate().alpha(1).setDuration(2000);

//      bartgambar.animate().translationYBy(1000).setDuration(2000); // gambar turun kebawa

//        bartgambar.animate().translationYBy(-1000).setDuration(2000); // ke atas

//        bartgambar.animate().translationXBy(1000).setDuration(2000); // ke kanan
//        bartgambar.animate().translationXBy(-1000).setDuration(2000); // ke kiri
//        bartgambar.animate().rotation(180).setDuration(2000); // berputar 180 derajat
//        bartgambar.animate().rotation(1800).alpha(0).setDuration(2000); //berputar dan hilang

       bartgambar.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000); //gambar mengecil

        // chalange ubah alpha menjadi 1 pada bartgambar ////// salah salah
      //  bartgambar.animate().alpha(1).setDuration(1000);
//        bartgambar.animate().translationXBy(1000).alpha(0).setDuration(2000);
//        bartgambar.animate().translationXBy(-1000).alpha(1).setDuration(2000);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartgambar = (ImageView) findViewById(R.id.bartgambar);
        bartgambar.setX(-1000);
        bartgambar.animate().translationXBy(1000).rotation(3600).setDuration(2000);


    }
}
