/*
NAME:
DATE:
ASSIGNMENT: TIP CALCULATOR
 */

/*
**ASSIGNMENT: TIP CALCULATOR**

LAYOUT: (5 points)
    -convert the component tree to CONSTRAINT LAYOUT
    -must use table layout at least once
    -must use linear layout(horizontal) at least once
    -must have a top banner with your app title (nicely styled)
    -six buttons (5%, 10%, 15%, 20%, 25%, and custom %)
    -displays sub-total, tip amount, and grand total (all formatted in $x.xx)
    -EditText component to enter a number (the bill amount)
EVENT LISTENERS: (5 points)
    -add event listeners to all buttons and EditText component
    -add a dialog box alert for custom tip
JAVA CODE STRUCTURE: (5 points)
    -create a method called calculateTip(Button button){} that will accept the tip button the user
     selects, determine which button was selected, calculate the tip amount, and update the
     TextView's
     -comments for all new variables and methods
APP BEHAVIOR: (10 points)
    -user enters the bill amount
    -sub-total is displayed ($x.xx)
    -user selects the tip amount using one of the six buttons
    -tip amount is displayed ($x.xx)
    -grand total is displayed ($x.xx)
***NOTES***:
    -App cannot crash (-2 points on top of any additional penalties)
    -After entering the bill amount, the user will be able to select any tip at any time (-2)
    -User cannot select a tip amount before entering a bill amount (-2)

APP APPEARANCE: (5 points)
    -Must use at least two different fonts
    -Must use at least 3 different colors for your app (use www.colorhunt.co for palette ideas)
    -all layouts, components, etc nicely formatted and styled

CHALLENGES/BONUS: (1 point each)
    -button will change appearance to indicate it has been selected (changing the background color is best)
        -only one button can change it's appearance at a time
    -create a "dark mode" color palette switching feature
        -a new button (or switch) to change the color palette to a "darker" theme

HINTS:
-Use Log.d() to create debug messages. EX: Log.d("message: ", "TIP IS: " +tipAmount);
-Number formatting tricks in Java work the same in Android Studio (but there's other ways as well!)
-Be careful with your color choices - Android has strict standards for contrast, etc.


***Commit and push to your repos to submit assignment. Latest commit will be graded.****

 */

package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(Button button){

    }
}