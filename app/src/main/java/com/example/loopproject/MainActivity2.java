package com.example.loopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private EditText editText;
    private TextView ans;

    private Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.inputmultiplication);
        ans = findViewById(R.id.ansmaltiplication);

        button = findViewById(R.id.btn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans.setText("");


                for(int i=1; i<=10; i++){

                    String sring = editText.getText().toString();
                    Integer number = Integer.parseInt(sring);


                    ans.append(""+sring+" x "+i+"= "+number*i+"\n");


                }





            }
        });





    }
}