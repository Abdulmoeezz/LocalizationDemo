package com.example.abmoiz.localizationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buclick(View view) {
         String Msgs= getResources().getString(R.string.message);
        Toast.makeText(this,Msgs,Toast.LENGTH_LONG).show();



    }
}
