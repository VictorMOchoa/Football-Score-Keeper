package com.eatanapple.footballscoretracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScoreKeeperActivity extends AppCompatActivity {


    @BindView(R.id.team_one_tv)
    TextView teamOneTextView;

    @BindView(R.id.team_two_tv)
    TextView teamTwoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String teamOne = intent.getStringExtra("firstTeam");
        String teamTwo = intent.getStringExtra("secondTeam");

        teamOneTextView.setText(teamOne);
        teamTwoTextView.setText(teamTwo);

    }
}
