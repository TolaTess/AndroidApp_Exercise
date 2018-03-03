package com.tolaexample.relativeapp;

/*
@Tola Otesanya
 1st Mar 2018
 Third Android App java code
 Simple View to accept Username and password.
 App built using java codes
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    /*
    Manually coding Android layout and Text positioning using Java code
    */
    @Override
    //first screen to be called is the onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout tlayout = new RelativeLayout(this); //declare and create new R layout
        tlayout.setBackgroundColor(Color.LTGRAY);

        //Button
        Button redB = new Button(this); //declare and create new button
        redB.setText("Log In"); // name button Login
        redB.setBackgroundColor(Color.RED); //set button's colour

        //Username input
        EditText usern = new EditText(this); //create new EditText username
        EditText passw = new EditText(this);//create new EditText password

        //add id to each variable
        redB.setId(1);
        usern.setId(2);
        passw.setId(3);

        //create a container to store layout and positioning. it will automatically get the width and height
        RelativeLayout.LayoutParams bdetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams userNdetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams passWdetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Give rules to position userName widgets
        userNdetails.addRule(RelativeLayout.ABOVE, passw.getId());
        userNdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        //set spacing to bottom of the top widget
        userNdetails.setMargins(0,0,0,50);

        //Give rules to position Password widgets
        passWdetails.addRule(RelativeLayout.ABOVE, redB.getId());
        passWdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        //set spacing to password of the top widget
        passWdetails.setMargins(0,0,0,50);

        //Give rules to position button widgets
        bdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        bdetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Get a lot of information (String, Display)about your app.
        Resources r = getResources();
        //convert DIP to pixel - helps to made the size of the display consistent over different device
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        //setWidth only accept int of pixels
        usern.setWidth(px);
        passw.setWidth(px);

        //Add button to the new layout (button is now a child of layout)
        tlayout.addView(redB, bdetails);
        tlayout.addView(usern, userNdetails);
        tlayout.addView(passw, passWdetails);
        //This method set this activities to the view
        setContentView(tlayout);



    }
}
