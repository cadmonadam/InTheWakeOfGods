package com.example.android.inthewakeofgods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.inthewakeofgods.R.string.question1;
import static com.example.android.inthewakeofgods.R.string.question2;
import static com.example.android.inthewakeofgods.R.string.question9;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    //By pressing the "Start" button the app goes to the quiz screen.

    public void onClick(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}







