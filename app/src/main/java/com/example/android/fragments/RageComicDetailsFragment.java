package com.example.android.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RageComicDetailsFragment extends Fragment {

    //method for creating new instances of the fragment, a factory method.
    public static  RageComicDetailsFragment newInstance(){
        return new RageComicDetailsFragment();
    }

    //Create the view hierarchy controlled by the fragment.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rage_comic_details, container, false);
    }

}
