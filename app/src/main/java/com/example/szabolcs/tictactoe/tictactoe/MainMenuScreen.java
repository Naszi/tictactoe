package com.example.szabolcs.tictactoe.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Szabolcs on 2016.08.14..
 */
public class MainMenuScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_menu);
    }
}
