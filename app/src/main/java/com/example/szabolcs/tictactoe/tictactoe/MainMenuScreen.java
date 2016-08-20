package com.example.szabolcs.tictactoe.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainMenuScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_menu);

        ((Button) findViewById(R.id.button1)).setOnClickListener(new OnClickListener() {
            public void onClick(View V) {
                Log.d("DEBUG", "One Player Button Pressed!");
                Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
                intent.putExtra("gameType", true);
                startActivityForResult(intent, 0);
            }
        });

        ((Button) findViewById(R.id.button2)).setOnClickListener(new OnClickListener() {
            public void onClick(View V) {
                Log.d("DEBUG", "Two Player Button Pressed!");
                Intent intent = new Intent(MainMenuScreen.this, MainActivity.class);
                intent.putExtra("gameType", false);
                startActivityForResult(intent, 0);
            }
        });

        ((Button) findViewById(R.id.button3)).setOnClickListener(new OnClickListener() {
            public void onClick(View V) {
                Log.d("DEBUG", "Exit Game Button Pressed!");
                MainMenuScreen.this.finish();
            }
        });
    }
}