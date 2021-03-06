package com.example.connectfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class GameRules extends AppCompatActivity {
private TextView tv_rules;
private Button btn_game_play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_rules);
        tv_rules=findViewById(R.id.tv_rules);
        btn_game_play=findViewById(R.id.btn_game_play);

        btn_game_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation bounce_anim= AnimationUtils.loadAnimation(GameRules.this,R.anim.bounce_anim);
                btn_game_play.startAnimation(bounce_anim);
                startActivity(new Intent(GameRules.this,MainActivity.class));
            }
        });

        String text="";

        text="Connect4 is a game played by 2 players (player vs player, or player vs computer)";
        text+="\n\n";
        text+="Each player plays one after another, by putting down one piece at the lowest box of a slot. The goal is to be the first to connect 4 pieces in a line, horizontally, vertically or diagonally, before your opponent in a 7X6 grid.";
        text+="\n\n";
        text+="You get a point for every win vs player or vs the computer. You will be able to see your scores on User Profile page.";
        tv_rules.setText(text);
    }



}
