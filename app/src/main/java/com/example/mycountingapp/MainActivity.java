package com.example.mycountingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1 = 0;

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
        num1++;
        //Toast.makeText(this, "click 1st button", Toast.LENGTH_SHORT).show();
        updateIntroTV();

    }
    public void onClickSecondButton(View v)
    {
        num1--;
        updateIntroTV();
    }

    public void goToScrn2(View v)
    {
        startActivity(new Intent(MainActivity.this, Screen2.class));
    }

    public void openDialogue(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset count");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "click 2nd button", Toast.LENGTH_SHORT).show();
                num1 = 0;
                updateIntroTV();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void updateIntroTV()
    {
        TextView introTextView = (TextView) findViewById(R.id.titleTV);
        introTextView.setText("Now you have " + num1 + " fishes");
    }
}
