package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

        //Tracks the score for Cowboys
    int scoreCowboys = 0;

    //Tracks the score for other team
    int scoreOtherTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinnerTeams);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.spinner_item, getResources().getStringArray(R.array.teams));
        myAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

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

    /**
     * Increase the score for Cowboys by 1 point.
     */
    public void addOneForCowboys(View v) {
        scoreCowboys = scoreCowboys + 1;
        displayForCowboys(scoreCowboys);
    }

    /**
     * Increase the score for Cowboys by 2 points.
     */
    public void addTwoForCowboys(View v) {
        scoreCowboys = scoreCowboys + 2;
        displayForCowboys(scoreCowboys);
    }

    /**
     * Increase the score for Cowboys by 3 points.
     */
    public void addThreeForCowboys(View v) {
        scoreCowboys = scoreCowboys + 3;
        displayForCowboys(scoreCowboys);
    }

    /**
     * Increase the score for Cowboys by 6 points.
     */
    public void addSixForCowboys(View v) {
        scoreCowboys = scoreCowboys + 6;
        displayForCowboys(scoreCowboys);
    }

    /**
     * Increase the score for other team by 1 point.
     */
    public void addOneForOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 1;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Increase the score for other team by 2 points.
     */
    public void addTwoForOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 2;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Increase the score for other team by 3 points.
     */
    public void addThreeForOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 3;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Increase the score for other team by 6 points.
     */
    public void addSixForOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 6;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Displays the given score for Cowboys.
     */
    public void displayForCowboys(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for other team.
     */
    public void displayForOtherTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset scores to zero and displays zero score.
     */
    public void resetScore(View v) {
        scoreCowboys = 0;
        scoreOtherTeam = 0;
        displayForCowboys(scoreCowboys);
        displayForOtherTeam(scoreOtherTeam);

    }

}