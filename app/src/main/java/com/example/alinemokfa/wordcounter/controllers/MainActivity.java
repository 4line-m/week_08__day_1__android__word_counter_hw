package com.example.alinemokfa.wordcounter.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alinemokfa.wordcounter.R;
import com.example.alinemokfa.wordcounter.models.WordCounter;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText inputText;
    private Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.counter);
        this.inputText = (EditText) findViewById(R.id.inputEditText);
        this.countButton = (Button) findViewById(R.id.count_button);
    }

    public void onButtonClicked(View button){
        int  wordCount = WordCounter.wordCount(this.inputText.getText().toString());
        this.counter.setText(String.valueOf(wordCount) + " words.");
    }
}
