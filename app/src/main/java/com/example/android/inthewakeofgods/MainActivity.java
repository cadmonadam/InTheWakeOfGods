package com.example.android.inthewakeofgods;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // This app displays the users correct answers in a numeric format
    // This integer counts the number of correct answers
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    // This method is called when the CHECK YOUR RESULTS button is clicked
    public void submitOrder(View view) {
        score = 0;
        score += checkQuestion1();
        score += checkQuestion2();
        score += checkQuestion3();
        score += checkQuestion4();
        Toast.makeText(this, "You answered correctly to "+ score + " out of 4 questions", Toast.LENGTH_SHORT).show();
    }

    //This method checks question 1. If the answer is correct then score increases by 1
    public int checkQuestion1() {

        RadioButton question1 = (RadioButton) findViewById(R.id.answer_prometheus);
        boolean Prom = question1.isChecked();

        if (Prom) {
            return 1;
        } else {
            return 0;
        }
    }

    // This method checks question 2. If the answer is correct then score increases by 1
    public int checkQuestion2() {

        CheckBox question2A = (CheckBox) findViewById(R.id.leonardo);
        boolean Leonardo = question2A.isChecked();

        CheckBox question2B = (CheckBox) findViewById(R.id.tom_hardy);
        boolean Tom = question2B.isChecked();

        if (Leonardo && Tom) {
            return 1;
        } else {
            return 0;
        }
    }

    // This method checks question 3. If the answer is correct then score increases by 1
    public int checkQuestion3() {

        EditText question3 = (EditText) findViewById(R.id.edit_view_1);
        Editable userText = question3.getText();
        String StarWars = userText.toString().toLowerCase();

        if (StarWars.equals("force be with you")) {
            return 1;
        } else {
            return 0;
        }
    }

    //This method checks question 4. If the answer is correct then score increases by 1
    public int checkQuestion4() {

        RadioButton question4 = (RadioButton) findViewById(R.id.emily);
        boolean emily = question4.isChecked();

        if (emily) {
            return 1;
        } else {
            return 0;
        }
    }
}