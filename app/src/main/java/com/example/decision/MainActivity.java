package com.example.decision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public enum Group { A, B }
    public enum Week { WEEK_1, WEEK_2 }

    private Group group = Group.A;
    private Week week = Week.WEEK_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonsListeners();
    }


    /**
     function for setting up the listeners for this activity buttons
     */
    void setButtonsListeners() {
        ToggleButton toggleGroup = (ToggleButton) findViewById(R.id.btn_group);
        toggleGroup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    group = Group.B;
                } else {
                    // The toggle is disabled
                    group = Group.A;
                }
            }
        });

        ToggleButton toggleWeek = (ToggleButton) findViewById(R.id.btn_week);
        toggleWeek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    week = Week.WEEK_2;
                } else {
                    // The toggle is disabled
                    week = Week.WEEK_1;
                }
            }
        });

        final Button nextBtn = (Button)findViewById(R.id.btn_next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if(group == Group.A && week == Week.WEEK_1){
                    startSelectActivity(true);
                }else if(group == Group.A && week == Week.WEEK_2){
                    startSelectActivity(false);
                }else if(group == Group.B && week == Week.WEEK_1){
                    startSelectActivity(false);
                }else if(group == Group.B && week == Week.WEEK_2){
                    startSelectActivity(true);
                }
            }
        });
    }

    void startSelectActivity(boolean jokes) {
        Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
        Bundle b = new Bundle();
        //Put parameters to Root activity - to start lost view or found view
        b.putBoolean(Utils.EXTRA_IS_JOKES, jokes);
        intent.putExtras(b);
        startActivity(intent);
    }
}
