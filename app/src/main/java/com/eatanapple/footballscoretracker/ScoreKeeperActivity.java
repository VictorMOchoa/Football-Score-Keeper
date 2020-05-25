package com.eatanapple.footballscoretracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScoreKeeperActivity extends AppCompatActivity {

    @BindView(R.id.team_one_score_tv)
    TextView teamOneScoreTextView;
    @BindView(R.id.team_two_score_tv)
    TextView teamTwoScoreTextView;

    @BindView(R.id.team_one_tv)
    TextView teamOneTextView;
    @BindView(R.id.team_two_tv)
    TextView teamTwoTextView;

    int teamOneScore = 0;
    int teamTwoScore = 0;

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
        updateTeamOneScore();
        updateTeamTwoScore();
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.team_one_td_btn:
                teamOneScore += 6;
                break;
            case R.id.team_two_td_btn:
                teamTwoScore += 6;
                break;
            case R.id.team_one_extra_pt_btn:
                teamOneScore += 1;
                break;
            case R.id.team_two_extra_pt_btn:
                teamTwoScore += 1;
                break;
            case R.id.team_one_fg_btn:
                teamOneScore += 3;
                break;
            case R.id.team_two_fg_btn:
                teamTwoScore += 3;
                break;
            case R.id.team_one_safety_btn:
                teamOneScore += 2;
                break;
            case R.id.team_two_safety_btn:
                teamTwoScore += 2;
                break;
            case R.id.team_one_two_pt_btn:
                teamOneScore += 2;
                break;
            case R.id.team_two_two_pt_btn:
                teamTwoScore += 2;
                break;
            case  R.id.reset_btn:
                resetScores();
                break;
        }
        updateTeamOneScore();
        updateTeamTwoScore();

    }

    public void updateTeamOneScore() {
        teamOneScoreTextView.setText(teamOneScore + "");
    }

    public void updateTeamTwoScore() {
        teamTwoScoreTextView.setText(teamTwoScore + "");
    }

    public void resetScores() {
        teamOneScore = 0;
        teamTwoScore = 0;
        updateTeamOneScore();
        updateTeamTwoScore();
    }
}
