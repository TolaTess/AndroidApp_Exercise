package com.tolaexample.tolasfirstapp;

/*
@Tola Otesanya
21st Feb 2018
First Android App Java codes
Simple View to understand how each method is invoked as Users use the app.
*/

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log; //use to look at what each activity is doing

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "tolasMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate"); //great for debugging
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send me an email", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    //start of print out of activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "App is starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "App is resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "User temporarily not using app");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "User no longer using app");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "User restarting app/ most likely after onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "User has shutdown the app");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
