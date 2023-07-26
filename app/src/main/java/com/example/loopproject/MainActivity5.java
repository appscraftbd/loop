package com.example.loopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);



        editText = findViewById(R.id.input);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.ans);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String snumber = editText.getText().toString();
                Integer inumber = Integer.parseInt(snumber);

                textView.setText("The square natural upto "+snumber+" terms are : ");



                int t;
                int m = 0;

                for (int i =1; i<=inumber; i++){

                    t = i*i;

                    textView.append(" "+t);

                    m = m+t;


                }

                textView.append("\n\nThe Sum of Square Natural Number upto "+snumber +
                        " terms = "+m);


            }
        });




    }
}