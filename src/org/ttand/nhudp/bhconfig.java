package org.ttand.nhudp;

import android.app.Activity;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.Menu;
import android.util.Log;
import java.util.List;

public class bhconfig extends PreferenceActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.pref_head, target);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    protected boolean isValidFragment(String fragmentName)
    {
        //Log.i("args", "isValidFragment: " + fragmentName + "\t" + ProfilesFragment.class.getName());

        return ProfilesFragment.class.getName().equals(fragmentName)||
               RedirectFragment.class.getName().equals(fragmentName)||
               TunnelFragment.class.getName().equals(fragmentName);
    }

    public static class ProfilesFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            PreferenceManager.setDefaultValues(getActivity(),
                    R.xml.pref, false);
            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.pref);
        }
    }

    public static class RedirectFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            PreferenceManager.setDefaultValues(getActivity(),
                    R.xml.pref, false);
            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.pref);
        }
    }

    public static class TunnelFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            PreferenceManager.setDefaultValues(getActivity(),
                    R.xml.pref, false);
            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.pref);
        }
    }
}
