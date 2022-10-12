package com.example.w5_p2;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;


public class ImageFragment extends android.app.Fragment {
    private ImageView img;
    private int[] images = {
            R.drawable._200px_un1_svg,
            R.drawable._200px_deux_svg,
            R.drawable._200px_trois_svg
    };

    private int[] ratings = {0,0,0};
    private int count = 0;

    public ImageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View fragmentView = getView();
        MainActivity fragmentActivity = (MainActivity) getActivity();

        img = (ImageView) fragmentView.findViewById(R.id.image_view);
        img.setBackgroundResource(images[0]);
        RatingBar rating = (RatingBar) fragmentView.findViewById(R.id.rating_bar);
    }

    public void moveRight(){
        count = (count+1 == images.length) ? 0 : count+1;
        img.setBackgroundResource(images[count]);
    }

    public void moveLeft(){
        count = (count-1 == -1) ? images.length-1 : count-1;
        img.setBackgroundResource(images[count]);
    }
}