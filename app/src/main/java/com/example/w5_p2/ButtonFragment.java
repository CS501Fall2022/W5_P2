package com.example.w5_p2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends android.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View fragmentView = getView();
        MainActivity fragmentActivity = (MainActivity) getActivity();

        Button left = (Button) fragmentView.findViewById(R.id.left);
        Button right = (Button) fragmentView.findViewById(R.id.right);
    }
}