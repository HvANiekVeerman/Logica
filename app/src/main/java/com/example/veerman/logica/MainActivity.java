package com.example.veerman.logica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText input3;
    EditText input4;
    Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.plain_text_input1);
        input2 = (EditText) findViewById(R.id.plain_text_input2);
        input3 = (EditText) findViewById(R.id.plain_text_input3);
        input4 = (EditText) findViewById(R.id.plain_text_input4);

        checkButton = (Button) findViewById(R.id.button);

        input1.setGravity(Gravity.CENTER_HORIZONTAL);
        input2.setGravity(Gravity.CENTER_HORIZONTAL);
        input3.setGravity(Gravity.CENTER_HORIZONTAL);
        input4.setGravity(Gravity.CENTER_HORIZONTAL);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String input1Text = input1.getText().toString();
               String input2Text = input2.getText().toString();
               String input3Text = input3.getText().toString();
               String input4Text = input4.getText().toString();

                if(TextUtils.isEmpty(input1Text) || TextUtils.isEmpty(input2Text) || TextUtils.isEmpty(input3Text) || TextUtils.isEmpty(input4Text)){
                    Toast.makeText(getApplicationContext(), R.string.emptyAnswers,
                            Toast.LENGTH_LONG).show();
                }else if (input1Text.equals(getString(R.string.T)) && input2Text.equals(getString(R.string.F)) && input3Text.equals(getString(R.string.F)) && input4Text.equals(getString(R.string.T))) {
                    Toast.makeText(getApplicationContext(), R.string.correctAnswers, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), R.string.incorrectAnswers, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
