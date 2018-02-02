package com.example.hp.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button answer= (Button) findViewById(R.id.answer_button);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final EditText height = (EditText) findViewById(R.id.height);
        final TextView output = (TextView) findViewById(R.id.answer_text);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float get_Weight= Float.valueOf(String.valueOf(weight.getText()));
                float get_Height= Float.valueOf(String.valueOf(height.getText()));
                float answer= get_Weight/(get_Height*get_Height);
                output.setText(String.valueOf(answer));
            }
        });

    }
}
