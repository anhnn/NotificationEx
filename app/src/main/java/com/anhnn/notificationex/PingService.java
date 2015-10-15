package com.anhnn.notificationex;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class PingService extends Service {
    private static final String LOG_TAG = "Notification";

    public PingService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "Ping Service");
        return null;
    }
}
