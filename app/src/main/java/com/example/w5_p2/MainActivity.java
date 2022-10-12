package com.example.w5_p2;

import androidx.appcompat.app.AppCompatActivity;



import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

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
    protected void onStart(){
        super.onStart();
        setListeners();
    }

    public void setListeners(){
        FragmentManager fragmentManager = getFragmentManager();
        ButtonFragment btnFragment = (ButtonFragment) fragmentManager.findFragmentById(R.id.buttons);
        View btnFragmentView = btnFragment.getView();
        Button left = btnFragmentView.findViewById(R.id.left);
        Button right = btnFragmentView.findViewById(R.id.right);

        ImageFragment imgFragment = (ImageFragment) fragmentManager.findFragmentById(R.id.images);
        View imgFragmentView  = imgFragment.getView();
        RatingBar ratings = imgFragmentView.findViewById(R.id.rating_bar);

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFragment.moveRight();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFragment.moveLeft();
            }
        });
    }
}