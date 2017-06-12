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

import static com.example.android.inthewakeofgods.R.string.question5;

/**
 * This is the quiz activity screen.
 */

public class Quiz extends AppCompatActivity {


    // This integer counts the number of correct answers.
    int numberOfCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    // This method is called when you click the SUBMIT YOUR ANSWERS button
    //It shows different toast messages according to the scores achieved.

    public void checkAnswers(View view) {
        numberOfCorrectAnswers = 0;
        numberOfCorrectAnswers += checkQuestion1();
        numberOfCorrectAnswers += checkQuestion2();
        numberOfCorrectAnswers += checkQuestion3();
        numberOfCorrectAnswers += checkQuestion4();
        numberOfCorrectAnswers += checkQuestion5();
        numberOfCorrectAnswers += checkQuestion6();
        numberOfCorrectAnswers += checkQuestion7();
        numberOfCorrectAnswers += checkQuestion8();
        numberOfCorrectAnswers += checkQuestion9();
        numberOfCorrectAnswers += checkQuestion10();

        if (numberOfCorrectAnswers <= 4) {
            Toast.makeText(this, "You answered correctly to " + numberOfCorrectAnswers + " out of 10 questions. " + " Not too bad!", Toast.LENGTH_LONG).show();
        } else if (numberOfCorrectAnswers > 8) {
            Toast.makeText(this, "You answered correctly to " + numberOfCorrectAnswers + " out of 10 questions. " + " Excellent Job!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "You answered correctly to " + numberOfCorrectAnswers + " out of 10 questions. " + " Well done!", Toast.LENGTH_LONG).show();
        }
    }

    //This method checks question 1. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion1() {

        RadioButton question1 = (RadioButton) findViewById(R.id.q1a2);
        boolean isAnswerPrometheus = question1.isChecked();

        if (isAnswerPrometheus) {
            return 1;
        } else {
            return 0;
        }
    }

    // This method checks question 2. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion2() {

        EditText question2 = (EditText) findViewById(R.id.q2a);
        Editable userText = question2.getText();
        String answerQuestion2 = userText.toString().trim();

        if (answerQuestion2.equalsIgnoreCase("Ares")) {
            return 1;
        } else {
            return 0;
        }
    }

    //This method checks question 3. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion3() {

        RadioButton question3 = (RadioButton) findViewById(R.id.q3a2);
        boolean isAnswerHephaestus = question3.isChecked();

        if (isAnswerHephaestus) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 4. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion4() {

        EditText question4 = (EditText) findViewById(R.id.q4a);
        Editable userText = question4.getText();
        String answerQuestion4 = userText.toString().trim();

        if (answerQuestion4.equalsIgnoreCase("Zeus")) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 5. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion5() {

        EditText question5 = (EditText) findViewById(R.id.q5a);
        Editable userText = question5.getText();
        String answerQuestion5 = userText.toString().trim();

        if (answerQuestion5.equalsIgnoreCase("Aphrodite")) {
            return 1;
        } else {
            return 0;
        }
    }


    //This method checks question 6. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion6() {

        RadioButton question6 = (RadioButton) findViewById(R.id.q6a2);
        boolean isAnswerHades = question6.isChecked();

        if (isAnswerHades) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 7. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion7() {

        EditText question7 = (EditText) findViewById(R.id.q7a);
        Editable userText = question7.getText();
        String answerQuestion7 = userText.toString().trim();

        if (answerQuestion7.equalsIgnoreCase("Hera")) {
            return 1;
        } else {
            return 0;
        }
    }

    //This method checks question 8. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion8() {

        RadioButton question8 = (RadioButton) findViewById(R.id.q8a1);
        boolean isAnswerPoseidon = question8.isChecked();

        if (isAnswerPoseidon) {
            return 1;
        } else {
            return 0;
        }
    }


    // This method checks question 9. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion9() {

        CheckBox question9A = (CheckBox) findViewById(R.id.q9a1);
        boolean isAnswerLion = question9A.isChecked();

        CheckBox question9B = (CheckBox) findViewById(R.id.q9a2);
        boolean isAnwerTitan = question9B.isChecked();

        CheckBox question9C = (CheckBox) findViewById(R.id.q9a3);
        boolean isAnswerBull = question9C.isChecked();

        CheckBox question9D = (CheckBox) findViewById(R.id.q9a4);
        boolean isAnswerMedusa = question9D.isChecked();


        if (isAnswerLion && isAnswerBull && !isAnwerTitan && !isAnswerMedusa) {
            return 1;
        } else {
            return 0;
        }
    }

// This method checks question 10. In case of correct answer the value of numberOfCorrectAnswers is increased by 1.

    public int checkQuestion10() {

        EditText question10 = (EditText) findViewById(R.id.q10a);
        Editable userText = question10.getText();
        String answerQuestion10 = userText.toString().trim();

        if (answerQuestion10.equalsIgnoreCase("Morpheus")) {
            return 1;
        } else {
            return 0;
        }
    }

    //By pressing the "Show the answers" button the app goes to the result screen.

    public void onClick(View view) {
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);

    }
}


