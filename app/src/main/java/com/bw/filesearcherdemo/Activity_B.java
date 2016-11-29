package com.bw.filesearcherdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Activity_B extends AppCompatActivity {

    private String log = "Activity_B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }

    /**
     * 点击跳转至Activity_B
     *
     * @param view
     */
    public void BClickToA(View view) {
        startActivity(new Intent(Activity_B.this, Activity_A.class));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(log, "Activity_B_onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(log, "Activity_B_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(log, "Activity_B_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(log, "Activity_B_onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(log, "Activity_B_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(log, "Activity_B_onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(log, "Activity_B_onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i(log, "Activity_B_onRestoreInstanceState");

    }
}
