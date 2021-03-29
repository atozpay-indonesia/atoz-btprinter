package com.example.atozbluetoothprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.atozbtprinterlib.AtozBtPrinter;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(view -> AtozBtPrinter.initBluetoothPrinterManager(MainActivity.this)
                .open());
    }
}