package com.example.library7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toaster.Toaster;
import com.example.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toasty.whysosimple(this,"second library");
        Toaster.simpletoast(this,"first library");
    }
}