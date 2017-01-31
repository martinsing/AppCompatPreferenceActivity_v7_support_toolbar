package com.martinsing.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Megatron on 1/30/2017.
 */

abstract class AppCompatPreferenceFragment extends PreferenceFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_settings, container, false);
        if (view != null) {
            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
            ((AppCompatPreferenceActivity) getActivity()).setSupportActionBar(toolbar);
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        View frame = (View) getView().getParent();
        if (frame != null) frame.setPadding(0, 0, 0, 0);
    }
}
