package com.bw.filesearcherdemo;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity_A extends AppCompatActivity {


    private String log = "Activity_A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.i(log, "Activity_A_onCreate");
    }

    /**
     * 点击跳转至Activity_B
     *
     * @param view
     */
    public void AClickToB(View view) {
        startActivity(new Intent(Activity_A.this, Activity_B.class));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(log, "Activity_A_onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(log, "Activity_A_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(log, "Activity_A_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(log, "Activity_A_onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(log, "Activity_A_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(log, "Activity_A_onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(log, "Activity_A_onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i(log, "Activity_A_onRestoreInstanceState");
    }
}
