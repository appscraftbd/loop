package com.example.loopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        editText = findViewById(R.id.input);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.ans);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("Expected Output : ");


                String snumber = editText.getText().toString();
                Integer inumber = Integer.parseInt(snumber);

                int t=0;
                int m = 0;
                for (int i =1; i<=inumber; i++){

                    t=t*10+9;

                    textView.append(" "+t);

                    m = m+t;


                }

                textView.append("\n\nThe sum of the saries = "+m);








            }
        });



    }
}