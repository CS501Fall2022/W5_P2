package com.example.w5_p2;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;


public class ImageFragment extends android.app.Fragment {

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

        ImageView img = (ImageView) fragmentView.findViewById(R.id.image_view);
        RatingBar rating = (RatingBar) fragmentView.findViewById(R.id.rating_bar);
    }
}