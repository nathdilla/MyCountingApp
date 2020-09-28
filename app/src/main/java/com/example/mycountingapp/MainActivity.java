package com.example.mycountingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "*************This is a log***************");
        Log.e("error", "*************This is an error***************");
        Log.w("warning", "*************This is a warning***************");
        Log.wtf("What a terrible failture", "***FAILURE**");

        Toast.makeText(this, "ye", Toast.LENGTH_SHORT).show();
    }

    public void onClickFirstButton(View v)
    {
        Toast.makeText(this, "click 1st button", Toast.LENGTH_SHORT).show();
    }
    public void onClickSecondButton(View v)
    {
        Toast.makeText(this, "click 2nd button", Toast.LENGTH_SHORT).show();
    }
}
