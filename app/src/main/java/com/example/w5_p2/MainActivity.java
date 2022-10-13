package com.example.w5_p2;

import androidx.appcompat.app.AppCompatActivity;



import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity implements ButtonFragment.ButtonInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonFragment btnFragment = new ButtonFragment();
        ImageFragment imgFragment = new ImageFragment();

        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentById(R.id.buttons) == null) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.buttons, btnFragment);
            transaction.commit();
        }
        if (fragmentManager.findFragmentById(R.id.images) == null){
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.images, imgFragment);
            transaction.commit();
        }

    }

    @Override
    public void pressLeft() {
        FragmentManager fragmentManager = getFragmentManager();
        ImageFragment imgFragment = (ImageFragment) fragmentManager.findFragmentById(R.id.images);

        imgFragment.moveLeft();
    }

    @Override
    public void pressRight() {
        FragmentManager fragmentManager = getFragmentManager();
        ImageFragment imgFragment = (ImageFragment) fragmentManager.findFragmentById(R.id.images);

        imgFragment.moveRight();
    }
}