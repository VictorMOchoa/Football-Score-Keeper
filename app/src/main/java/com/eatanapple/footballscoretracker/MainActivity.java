package com.eatanapple.footballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.eatanapple.footballscoretracker.utils.ScoreKeeperUtils.*;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.team_one_et)
    EditText teamOneEditText;
    @BindView(R.id.team_two_et)
    EditText teamTwoEditText;
    @BindView(R.id.submit_btn)
    Button submitBtn;

    String teamOneName, teamTwoName;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamOneName = teamOneEditText.getText().toString();
                teamTwoName = teamTwoEditText.getText().toString();
                if (isInputValid(teamOneName) && isInputValid(teamTwoName)) {
                    // Do cool stuff
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Please validate that you have entered a name for both teams",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
