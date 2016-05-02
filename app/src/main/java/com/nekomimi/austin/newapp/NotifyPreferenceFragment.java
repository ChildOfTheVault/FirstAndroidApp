package com.nekomimi.austin.newapp;

import android.preference.PreferenceFragment;
import android.os.Bundle;

public class NotifyPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_notify);
    }
}
