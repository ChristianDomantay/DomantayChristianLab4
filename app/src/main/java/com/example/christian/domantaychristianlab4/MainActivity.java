package com.example.christian.domantaychristianlab4;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ith", "onCreate() has executed...");
    }

    public void process(View v){
       // Intent i=null , choose=null;
        if(v.getId()==R.id.btnBack){
       Toast.makeText(this,"TOAST", Toast.LENGTH_LONG).show();
          //  Log.d("4ith", "TOAST has executed");
        }else if(v.getId()==R.id.btnNext){
          //  Log.d("4ith", "SNACKBAR has executed");
            Snackbar.make(v,"SNACKBAR",Snackbar.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ith", "onStart() has executed");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ith", "onResume()has executed");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ith", "onStop() has executed...");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ith", "onPause() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ith", "onRestart() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ith", "onDestroy() has executed");
    }




}
