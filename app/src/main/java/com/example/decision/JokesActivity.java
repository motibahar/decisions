package com.example.decision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.Random;

public class JokesActivity extends AppCompatActivity {

    private boolean isJokes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        isJokes = intent.getBooleanExtra(Utils.EXTRA_IS_JOKES, false);

        TextView myAwesomeTextView = (TextView)findViewById(R.id.joke_or_fact);


        Random random = new Random();
        int randomNum = random.nextInt(Utils.JOKES.length);
        if(isJokes == true){
            myAwesomeTextView.setText(Utils.JOKES[randomNum]);
//            myAwesomeTextView.setText(Utils.JOKE5);
        }else{
            myAwesomeTextView.setText(Utils.FACTS[randomNum]);
        }
        myAwesomeTextView.setMovementMethod(new ScrollingMovementMethod());

    }
}
