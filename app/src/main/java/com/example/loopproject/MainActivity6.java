package com.example.loopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        editText = findViewById(R.id.input);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.ans);
        textView2 = findViewById(R.id.ans2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("");

                String text = editText.getText().toString();
                Character ch,ch2;



                int number = text.length();

                for(int i =0; i<text.length();i++){



                    number = number-1;
                    ch = text.charAt(number);
                    textView.append(""+ch);


                    String snumber = editText.getText().toString();
                    ch2 = snumber.charAt(i);



                    if (ch == ch2){

                        textView2.setText("The number is palindrome");


                    }else{
                        textView2.setText("The number isn,t palindrome");


                    }

                }




            }
        });





    }
}