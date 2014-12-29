package com.znuked.servicebound;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Bidyut on 12/29/2014.
 */
public class BoundService extends Service {

    private final IBinder binder = new LocalBinder();

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("service", "bound!!!");
        return binder;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public class LocalBinder extends Binder {
        BoundService getService() {
            return BoundService.this;
        }
    }
}
