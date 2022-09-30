package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArrayAdapter = (Button) findViewById(R.id.ButtonArrayAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent ıntent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(ıntent);


            }
        });



    }
}