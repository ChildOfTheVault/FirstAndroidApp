package com.nekomimi.austin.newapp;

import android.preference.PreferenceActivity;
//import android.preference.PreferenceFragment;
//import android.os.Bundle;

import java.util.List;

public class DisplayPreferences extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {
     loadHeadersFromResource(R.xml.preference_headers, target);
    }
}
