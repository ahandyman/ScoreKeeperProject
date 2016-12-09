package com.example.vizcarradeveloper.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_teamA;
    int total_teamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one_point_A(View view) {
        total_teamA +=1;
        displayA(total_teamA);
    }

    public void two_point_A(View view) {
        total_teamA +=2;
        displayA(total_teamA);
    }

    public void three_point_A(View view) {
        total_teamA +=3;
        displayA(total_teamA);
    }

    public void one_point_B(View view) {
        total_teamB +=1;
        displayB(total_teamB);
    }

    public void two_point_B(View view) {
        total_teamB +=2;
        displayB(total_teamB);
    }

    public void three_point_B(View view) {
        total_teamB +=3;
        displayB(total_teamB);
    }

    public void reset(View view) {
        total_teamA = 0;
        total_teamB = 0;
        displayA(total_teamA);
        displayB(total_teamB);
    }

    /**
     * This method displays the given score of team A on the screen
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_teamA);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given score of team B on the screen.
     */
    public void displayB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_teamB);
        scoreView.setText(String.valueOf(score));
    }
}
