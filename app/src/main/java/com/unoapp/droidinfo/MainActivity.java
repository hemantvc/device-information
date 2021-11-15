package com.unoapp.droidinfo;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "DeviceInfo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView tvDeviceInfo = findViewById(R.id.tv_device_info);
        tvDeviceInfo.setText(getHardwareAndSoftwareInfo());
        tvDeviceInfo.setTextSize(20);




        String board = Build.BOARD;
        String bootloader = Build.BOOTLOADER;
        String brand = Build.BRAND;
        String device = Build.DEVICE;
        String display = Build.DISPLAY;
        String hardware = Build.HARDWARE;
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        String product = Build.PRODUCT;
        String serial = Build.SERIAL;

        Log.d(TAG," Model: " + model);
        Log.d(TAG," OS Version: " + model);

        Log.d(TAG, "Board: " + board + " Bootloader: " + bootloader + " Brand: " + brand + " Display: " + display);
        Log.d(TAG, "Hardware: " + hardware + " Manufacturer: " + manufacturer + " Model: " + model + " Product: " + product + " Serial: " + serial);

        // Refer for version codes : https://developer.android.com/reference/android/os/Build.VERSION_CODES.html
        String baseOs = Build.VERSION.BASE_OS;
        String codeName = Build.VERSION.CODENAME;
        String versionRelease = Build.VERSION.RELEASE;
        String sdk = Build.VERSION.SDK;
        int buildVersion = Build.VERSION.SDK_INT;

        Log.d(TAG, "BaseOs: " + baseOs + " CodeName: " + codeName + " Build Release Version: " + versionRelease + " Sdk: " + sdk + " Build SDK Version: " + buildVersion);

        if (buildVersion >= android.os.Build.VERSION_CODES.Q) {
            Log.d(TAG, "Android Version of This device is : Android Q : " + Build.VERSION.SDK_INT);
        } else if (buildVersion >= android.os.Build.VERSION_CODES.P) {
            Log.d(TAG, "Android Version of This device is : Android Pie : " + Build.VERSION.SDK_INT);
        } else {
            Log.d(TAG, "Android Version of This device is : " + Build.VERSION.SDK_INT);
        }
        Log.d(TAG,"=================================");
        Log.d(TAG," Make: " + Build.BRAND);
        Log.d(TAG," Model: " + model);
        Log.d(TAG," OS Version: " + versionRelease);
    }


    /**
     * method to fetch hardware and software information
     *
     * @return information
     */
    private String getHardwareAndSoftwareInfo() {

        return getString(R.string.serial) + " " + Build.SERIAL + "\n" +
            getString(R.string.model) + " " + Build.MODEL + "\n" +
            getString(R.string.id) + " " + Build.ID + "\n" +
            getString(R.string.manufacturer) + " " + Build.MANUFACTURER + "\n" +
            getString(R.string.brand) + " " + Build.BRAND + "\n" +
            getString(R.string.type) + " " + Build.TYPE + "\n" +
            getString(R.string.user) + " " + Build.USER + "\n" +
            getString(R.string.base) + " " + Build.VERSION_CODES.BASE + "\n" +
            getString(R.string.incremental) + " " + Build.VERSION.INCREMENTAL + "\n" +
            getString(R.string.sdk) + " " + Build.VERSION.SDK + "\n" +
            getString(R.string.board) + " " + Build.BOARD + "\n" +
            getString(R.string.host) + " " + Build.HOST + "\n" +
            getString(R.string.fingerprint) + " " + Build.FINGERPRINT + "\n" +
            getString(R.string.versioncode) + " " + Build.VERSION.RELEASE;
    }
}