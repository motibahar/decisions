package com.example.decision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    private boolean isJokes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Intent intent = getIntent();
        isJokes = intent.getBooleanExtra(Utils.EXTRA_IS_JOKES, false);
        setButtonsListeners();
    }

    /**
     function for setting up the listeners for this activity buttons
     */
    void setButtonsListeners() {
        final Button lostButton = (Button) findViewById(R.id.i_am_hungry);
        lostButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startJokesActivity();
            }
        });

        final Button foundButton = (Button)findViewById(R.id.end_of_the_day);
        foundButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startFormActivity();
            }
        });
    }

    /**
     function for starting the root activity after pressing on the desired button
     @ startLost boolean: flag that indicates the button selection. passed to CategoriesActivity.
     */
    void startJokesActivity() {
        Intent intent = new Intent(getApplicationContext(), JokesActivity.class);
        Bundle b = new Bundle();
        //Put parameters to Root activity - to start lost view or found view
        b.putBoolean(Utils.EXTRA_IS_JOKES, isJokes);
        intent.putExtras(b);
        startActivity(intent);
    }

    void startFormActivity() {
        Intent intent = new Intent(getApplicationContext(), FormActivity.class);
        startActivity(intent);
    }
}
