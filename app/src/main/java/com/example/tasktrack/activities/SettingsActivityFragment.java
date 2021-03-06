package com.example.tasktrack.activities;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.example.tasktrack.R;

public class SettingsActivityFragment extends PreferenceFragment {

    public static final String SETTINGS_SHARED_PREFERENCES_FILE_NAME = SettingsActivityFragment.class.getName() + ".SETTINGS_SHARED_PREFERENCES_FILE_NAME";
    private static final String LOGTAG = "TASKTRACKER";

    public SettingsActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getPreferenceManager().setSharedPreferencesName(SETTINGS_SHARED_PREFERENCES_FILE_NAME);

        addPreferencesFromResource(R.xml.preferences);

        Preference workDuration = findPreference("work_duration");
        Preference breakDuration = findPreference("break_duration");
        Preference longBreakDuration = findPreference("long_break_duration");
        Preference longBreakInterval = findPreference("long_break_interval");
    }
}