package com.ambrogio.example.udacityapps.sunshineapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ambrogio.example.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class SunshineMainActivityFragment extends Fragment {

    public SunshineMainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sunshine_fragment_main, container, false);
    }
}
