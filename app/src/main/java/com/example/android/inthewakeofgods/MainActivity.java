package com.example.android.inthewakeofgods;

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


    // This method is called when you click the CHECK YOUR ANSWERS button

    public void checkAnswers(View view) {
        score = 0;
        score += checkQuestion1();
        score += checkQuestion2();
        score += checkQuestion3();
        score += checkQuestion4();
        score += checkQuestion5();
        score += checkQuestion6();
        score += checkQuestion7();
        score += checkQuestion8();
        score += checkQuestion9();
        score += checkQuestion10();

        Toast.makeText(this, "You answered correctly to " + score + " out of 10 questions", Toast.LENGTH_SHORT).show();
    }

    //This method checks question 1. In case of correct answer the value of score is increased by 1.

    public int checkQuestion1() {

        RadioButton question1 = (RadioButton) findViewById(R.id.q1a2);
        boolean Prometheus = question1.isChecked();

        if (Prometheus) {
            return 1;
        } else {
            return 0;
        }
    }

    // This method checks question 2. In case of correct answer the value of score is increased by 1.

    public int checkQuestion2() {

        EditText question2 = (EditText) findViewById(R.id.q2a);
        Editable userText = question2.getText();
        String Ares = userText.toString();

        if (Ares.equals("Ares")) {
            return 1;
        } else {
            return 0;
        }
    }

    //This method checks question 3. In case of correct answer the value of score is increased by 1.

    public int checkQuestion3() {

        RadioButton question3 = (RadioButton) findViewById(R.id.q3a2);
        boolean Hephaestus = question3.isChecked();

        if (Hephaestus) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 4. In case of correct answer the value of score is increased by 1.

    public int checkQuestion4() {

        EditText question4 = (EditText) findViewById(R.id.q4a);
        Editable userText = question4.getText();
        String Zeus = userText.toString();

        if (Zeus.equals("Zeus")) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 5. In case of correct answer the value of score is increased by 1.

    public int checkQuestion5() {

        EditText question5 = (EditText) findViewById(R.id.q5a);
        Editable userText = question5.getText();
        String Aphrodite = userText.toString();

        if (Aphrodite.equals("Aphrodite")) {
            return 1;
        } else {
            return 0;
        }
    }


    //This method checks question 6. In case of correct answer the value of score is increased by 1.

    public int checkQuestion6() {

        RadioButton question6 = (RadioButton) findViewById(R.id.q6a2);
        boolean Hades = question6.isChecked();

        if (Hades) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 7. In case of correct answer the value of score is increased by 1.

    public int checkQuestion7() {

        EditText question5 = (EditText) findViewById(R.id.q7a);
        Editable userText = question5.getText();
        String Hera = userText.toString();

        if (Hera.equals("Hera")) {
            return 1;
        } else {
            return 0;
        }
    }

    //This method checks question 8. In case of correct answer the value of score is increased by 1.

    public int checkQuestion8() {

        RadioButton question8 = (RadioButton) findViewById(R.id.q8a1);
        boolean Poseidon = question8.isChecked();

        if (Poseidon) {
            return 1;
        } else {
            return 0;
        }
    }


    // This method checks question 9. In case of correct answer the value of score is increased by 1.

    public int checkQuestion9() {

        CheckBox question9A = (CheckBox) findViewById(R.id.q9a1);
        boolean Lion = question9A.isChecked();

        CheckBox question9C = (CheckBox) findViewById(R.id.q9a3);
        boolean Bull = question9C.isChecked();

        if (Lion && Bull) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 10. In case of correct answer the value of score is increased by 1.

    public int checkQuestion10() {

        EditText question10 = (EditText) findViewById(R.id.q10a);
        Editable userText = question10.getText();
        String Morpheus = userText.toString();

        if (Morpheus.equals("Morpheus")) {
            return 1;
        } else {
            return 0;
        }
    }
}







