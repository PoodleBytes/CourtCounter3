/**
 *   Continue Grow With Google Challenge Scholarship: Android Basics
 *      Project 2 - Basketball Court Counter
 *          RC-1a - made findViewByID public & removed from method
 *
 *           2018-04-09
 *           PoodleBytes
 */


package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Track score
    int scoreA = 0;
    int scoreB = 0;
    TextView tvScoreA;
    TextView tvScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = findViewById(R.id.ScoreA);
        tvScoreB = findViewById(R.id.ScoreB);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // Save the user's current game state
        outState.putInt("SCORE_A", scoreA);
        outState.putInt("SCORE_B", scoreB);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("SCORE_A");
        scoreB = savedInstanceState.getInt("SCORE_B");
        displayA(scoreA);
        displayB(scoreB);
    }


    //  +1 for A
    public void addOneA(View v) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    //  +2 for A
    public void addTwoA(View v) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    //  +3 for A
    public void addThreeA(View v) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    //  +1 for B
    public void addOneB(View v) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    //  +2 for B
    public void addTwoB(View v) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    //  +3 for B
    public void addThreeB(View v) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    //reset
    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    //update team B score
    public void displayA(int score) {
        TextView tvScoreA = findViewById(R.id.ScoreA);
        tvScoreA.setText(String.valueOf(score));
    }

    //update team B score
    public void displayB(int score) {
        TextView tvScoreB = findViewById(R.id.ScoreB);
        tvScoreB.setText(String.valueOf(score));
    }
}
