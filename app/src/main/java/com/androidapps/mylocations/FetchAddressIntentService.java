package com.androidapps.mylocations;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.location.Geocoder;

import java.util.Locale;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class FetchAddressIntentService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.androidapps.mylocations.action.FOO";
    private static final String ACTION_BAZ = "com.androidapps.mylocations.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.androidapps.mylocations.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.androidapps.mylocations.extra.PARAM2";

    public FetchAddressIntentService() {
        super("FetchAddressIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
    }

}
