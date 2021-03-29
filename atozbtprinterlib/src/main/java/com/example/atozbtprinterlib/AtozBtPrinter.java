package com.example.atozbtprinterlib;

import android.content.Context;
import android.content.Intent;

public class AtozBtPrinter {
    public static final String TAG = "AtozBtPrinter";
    static AtozBtPrinter atozBtPrinter;
    Context mContext;

    public AtozBtPrinter(Context mContext) {
        this.mContext = mContext;
    }

    public static AtozBtPrinter initBluetoothPrinterManager(Context context) {
        atozBtPrinter = new AtozBtPrinter(context);
        return atozBtPrinter;
    }

    public void open() {
        Intent i = new Intent(mContext, ActivityPrinterDevicesDiscovery.class);
        mContext.startActivity(i);
    }

}
