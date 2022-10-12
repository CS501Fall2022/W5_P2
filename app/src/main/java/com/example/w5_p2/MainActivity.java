package com.example.w5_p2;

import androidx.appcompat.app.AppCompatActivity;



import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonFragment btnFragment = new ButtonFragment();
//        ImageFragment imgFragment = new ImageFragment();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction( );
        transaction.add( R.id.buttons, btnFragment );
//        transaction.add( R.id.images, imgFragment );
        transaction.commit();
    }
}