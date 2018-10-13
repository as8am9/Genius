package com.example.android.genius;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;
    boolean mCheck1;
    boolean mCheck2;
    boolean mCheck3;
    boolean mCheck4;
    boolean mCheck5;
    boolean mCheck6;
    boolean mCheck7;
    boolean mCheck8;
    boolean mCheck9;
    boolean mCheck10;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    EditText txt10;
    TextView txt10_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.quesNum1);
        txt2 = (TextView) findViewById(R.id.quesNum2);
        txt3 = (TextView) findViewById(R.id.quesNum3);
        txt4 = (TextView) findViewById(R.id.quesNum4);
        txt5 = (TextView) findViewById(R.id.quesNum5);
        txt6 = (TextView) findViewById(R.id.quesNum6);
        txt7 = (TextView) findViewById(R.id.quesNum7);
        txt8 = (TextView) findViewById(R.id.quesNum8);
        txt9 = (TextView) findViewById(R.id.quesNum9);
        txt10=(EditText)findViewById(R.id.ans_10);
        txt10_1=(TextView)findViewById(R.id.quesNum10);
    }


    //on click button method
    public void toast(View view) {
        Identify();
        mCheckBox();
        sumQuestions(mCheck1, mCheck2, mCheck3, mCheck4, mCheck5, mCheck6, mCheck7, mCheck8, mCheck9,mCheck10);
        Toast.makeText(this, "You have answered " + score + " correct question.", Toast.LENGTH_LONG).show();
    }

    // this method for getting booleans variable
    public void mCheckBox() {

        // for question number 1
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.no_1);
        if (radioButton1.isChecked()) {
            mCheck1 = true;
        } else {
            mCheck1 = false;
        }

        // for question number 2
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.no_2);
        if (radioButton2.isChecked()) {
            mCheck2 = true;
        } else {
            mCheck2 = false;
        }

        // for question number 3
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.no_3);
        if (radioButton3.isChecked()) {
            mCheck3 = true;
        } else {
            mCheck3 = false;
        }

        // for question number 4
        CheckBox checkBox = (CheckBox) findViewById(R.id.no_4);
        CheckBox checkBoxW1 = (CheckBox) findViewById(R.id.no_4w1);
        CheckBox checkBoxW2 = (CheckBox) findViewById(R.id.no_4w2);
        // for different values
        if (checkBox.isChecked() && checkBoxW1.isChecked() && checkBoxW2.isChecked()) {
            mCheck4 = false;
        } else if (checkBox.isChecked() && checkBoxW1.isChecked()) {
            mCheck4 = true;
        } else if (checkBox.isChecked() && checkBoxW2.isChecked()) {
            mCheck4 = false;
        } else if (checkBox.isChecked()) {
            mCheck4 = false;
        } else {
            mCheck4 = false;
        }

        // for question number 5
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.no_5);
        if (radioButton5.isChecked()) {
            mCheck5 = true;
        } else {
            mCheck5 = false;
        }

        // for question number 6
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.no_6);
        if (radioButton6.isChecked()) {
            mCheck6 = true;
        } else {
            mCheck6 = false;
        }

        // for question number 7
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.no_7);
        if (radioButton7.isChecked()) {
            mCheck7 = true;
        } else {
            mCheck7 = false;
        }

        // for question number 8
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.no_8);
        if (radioButton8.isChecked()) {
            mCheck8 = true;
        } else {
            mCheck8 = false;
        }


        // for question number 9
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.no_9);
        if (radioButton9.isChecked()) {
            mCheck9 = true;
        } else {
            mCheck9 = false;
        }

        // for question number 10
        String txtAns10=String.valueOf(txt10.getText());
        if (txtAns10.matches("7"))
        {
            mCheck10 = true;
        }else {
            mCheck10=false;
        }
    }

    //this method for calculating the score
    public int sumQuestions(boolean mCheck1, boolean mCheck2, boolean mCheck3, boolean mCheck4, boolean mCheck5, boolean mCheck6, boolean mCheck7, boolean mCheck8, boolean mCheck9, boolean mCheck10) {
        score = 0;

        if (mCheck1 == true)
            score += 1;

        if (mCheck2 == true)
            score += 1;

        if (mCheck3 == true)
            score += 1;

        if (mCheck4 == true)
            score += 1;

        if (mCheck5 == true)
            score += 1;

        if (mCheck6 == true)
            score += 1;

        if (mCheck7 == true)
            score += 1;

        if (mCheck8 == true)
            score += 1;

        if (mCheck9 == true)
            score += 1;

        if (mCheck10 == true)
            score += 1;

        wrongIdentify();
        return score;
    }

    public void wrongIdentify() {
        if (!mCheck1)
            txt1.setTextColor(Color.RED);
        if (!mCheck2)
            txt2.setTextColor(Color.RED);
        if (!mCheck3)
            txt3.setTextColor(Color.RED);
        if (!mCheck4)
            txt4.setTextColor(Color.RED);
        if (!mCheck5)
            txt5.setTextColor(Color.RED);
        if (!mCheck6)
            txt6.setTextColor(Color.RED);
        if (!mCheck7)
            txt7.setTextColor(Color.RED);
        if (!mCheck8)
            txt8.setTextColor(Color.RED);
        if (!mCheck9)
            txt9.setTextColor(Color.RED);
        if (!mCheck10)
            txt10_1.setTextColor(Color.RED);
    }

    public void Identify() {
        txt1.setTextColor(Color.BLACK);
        txt2.setTextColor(Color.BLACK);
        txt3.setTextColor(Color.BLACK);
        txt4.setTextColor(Color.BLACK);
        txt5.setTextColor(Color.BLACK);
        txt6.setTextColor(Color.BLACK);
        txt7.setTextColor(Color.BLACK);
        txt8.setTextColor(Color.BLACK);
        txt9.setTextColor(Color.BLACK);
        txt10_1.setTextColor(Color.BLACK);
    }
}

