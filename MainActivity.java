package com.damirpolutranko.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int home_score = 0;
    int away_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
     * Increase the score for Home by 6 points.
     */
    public void addTouchdownForHome(View v) {
        home_score = home_score + 6;
        displayForHome(home_score);
    }

    /**
     * Increase the score for Home by 1 point.
     */
    public void addExtraPointForHome(View v) {
        home_score = home_score + 1;
        displayForHome(home_score);
    }

    /**
     * Increase the score for Home by 2 points.
     */
    public void addTwoPointForHome(View v) {
        home_score = home_score + 2;
        displayForHome(home_score);
    }

    /**
     * Increase the score for Home by 3 points.
     */
    public void addFieldGolForHome(View v) {
        home_score = home_score + 3;
        displayForHome(home_score);
    }

    /**
     * Increase the score for Home by 2 points.
     */
    public void addSafetyForHome(View v) {
        home_score = home_score + 2;
        displayForHome(home_score);
    }

    /**
     * Increase the score for Away by 6 points.
     */
    public void addTouchdownForAway(View v) {
        away_score = away_score + 6;
        displayForAway(away_score);
    }

    /**
     * Increase the score for Away by 1 point.
     */
    public void addExtraPointForAway(View v) {
        away_score = away_score + 1;
        displayForAway(away_score);
    }

    /**
     * Increase the score for Away by 2 points.
     */
    public void addTwoPointForAway(View v) {
        away_score = away_score + 2;
        displayForAway(away_score);
    }

    /**
     * Increase the score for Away by 3 points.
     */
    public void addFieldGolForAway(View v) {
        away_score = away_score + 3;
        displayForAway(away_score);
    }

    /**
     * Increase the score for Away by 2 points.
     */
    public void addSafetyForAway(View v) {
        away_score = away_score + 2;
        displayForAway(away_score);
    }

    /**
     * Reset score to 0.
     */

    public void resetScore(View v) {
        home_score = 0;
        away_score = 0;
        displayForHome(home_score);
        displayForAway(away_score);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Away.
     */
    public void displayForAway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_score);
        scoreView.setText(String.valueOf(score));
    }
}