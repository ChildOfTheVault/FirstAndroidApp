package com.nekomimi.austin.newapp;

import android.preference.PreferenceFragment;
import android.os.Bundle;

public class UpdatePreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_update);
    }
}
