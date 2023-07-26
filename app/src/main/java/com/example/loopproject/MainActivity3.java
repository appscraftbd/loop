package com.example.loopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        editText = findViewById(R.id.input);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.ans);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("The even numbers are : ");

                String snumber = editText.getText().toString();
                Integer i = Integer.parseInt(snumber);

                int n = 0;

                for ( int x = 1; x<=i; x++){


                    int m = x*2;
                    n = n+m;

                    textView.append(""+m+"  ");




                }
                                    textView.append("\n\nThe Sum of even Natural Number up to " +snumber+" terms :"+n);







            }
        });





    }
}