package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.kgvalue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hey", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound= kg*2.205;
                textView.setText("The value in pound is:"+ pound);
            }
        });

    }
}