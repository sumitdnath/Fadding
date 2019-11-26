package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;
    public void fade(View view){

        Log.i("Info","Imge Fade");

        ImageView barImageView = (ImageView) findViewById(R.id.barImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        if(bartIsShowing) {
            bartIsShowing = false;
            barImageView.animate().alpha(0).setDuration(1500);
            homerImageView.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            barImageView.animate().alpha(1).setDuration(1500);
            homerImageView.animate().alpha(0).setDuration(2000);

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
