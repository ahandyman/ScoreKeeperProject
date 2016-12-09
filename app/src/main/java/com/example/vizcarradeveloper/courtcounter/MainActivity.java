package com.example.vizcarradeveloper.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_teamA;
    int total_teamB;

    int teamA_3pts;
    int teamA_2pts;
    int teamA_freethrows;

    int teamB_3pts;
    int teamB_2pts;
    int teamB_freethrows;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Two variable
     * total_teamA keeps track of total score
     * and
     * teamA_3pts, teamA_2pts, and teamA_freethrows keeps track of number of shots scored
     */
    public void one_point_A(View view) {
        total_teamA += 1;
        displayScoreA(total_teamA);
        teamA_freethrows += 1;
        displayScore_A_freethrow(teamA_freethrows);
    }

    public void two_point_A(View view) {
        total_teamA += 2;
        displayScoreA(total_teamA);
        teamA_2pts += 1;
        displayScore_A_twoPoints(teamA_2pts);

    }

    public void three_point_A(View view) {
        total_teamA +=3;
        displayScoreA(total_teamA);
        teamA_3pts += 1;
        displayScore_A_threePoints(teamA_3pts);

    }

    /**
     * Two variable
     * total_teamB keeps track of total score
     * and
     * teamB_3pts, teamB_2pts, and teamB_freethrows keeps track of number of shots scored
     */
    public void one_point_B(View view) {
        total_teamB +=1;
        teamB_freethrows += 1;
        displayScoreB(total_teamB);
        displayScore_B_freethrow(teamB_freethrows);
    }

    public void two_point_B(View view) {
        total_teamB +=2;
        teamB_2pts += 1;
        displayScoreB(total_teamB);
        displayScore_B_twoPoints(teamB_2pts);
    }

    public void three_point_B(View view) {
        total_teamB +=3;
        teamB_3pts += 1;
        displayScoreB(total_teamB);
        displayScore_B_threePoints(teamB_3pts);
    }

    public void reset(View view) {
        total_teamA = 0;
        total_teamB = 0;
        displayScoreA(total_teamA);
        displayScoreB(total_teamB);

        teamA_3pts = 0;
        teamA_2pts = 0;
        teamA_freethrows = 0;
        displayScore_A_threePoints(teamA_3pts);
        displayScore_A_twoPoints(teamA_2pts);
        displayScore_A_freethrow(teamA_freethrows);

        teamB_3pts = 0;
        teamB_2pts = 0;
        teamB_freethrows = 0;
        displayScore_B_threePoints(teamB_3pts);
        displayScore_B_twoPoints(teamB_2pts);
        displayScore_B_freethrow(teamB_freethrows);

    }

    /**
     * This method displays the given score of team A on the screen
     */
    private void displayScoreA(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamA);
        quantityTextView.setText("" + score);
    }

    /**
     * This method displays the given score of team B on the screen.
     */
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the total 3pts made by team A.
     */
    public void displayScore_A_threePoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.left_three_points);
        scoreView.setText(String.valueOf(score));
    }
        /**
         * This method displays the total 2pts made by team A.
         */
    public void displayScore_A_twoPoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.left_two_points);
        scoreView.setText(String.valueOf(score));
    }
        /**
         * This method displays the total free throws made by team A.
         */
    public void displayScore_A_freethrow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.left_freeThrow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the total 3pts made by team B.
     */
    public void displayScore_B_threePoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.right_three_points);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method displays the total 2pts made by team B.
     */
    public void displayScore_B_twoPoints(int score) {
        TextView scoreView = (TextView) findViewById(R.id.right_two_points);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method displays the total free throws made by team B.
     */
    public void displayScore_B_freethrow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.right_freeThrow);
        scoreView.setText(String.valueOf(score));
    }

}
