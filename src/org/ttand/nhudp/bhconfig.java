package org.ttand.nhudp;

import android.app.Activity;
import android.preference.PreferenceActivity;
import android.os.Bundle;

public class bhconfig extends PreferenceActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        addPreferencesFromResource(R.xml.pref);  
    }
}
