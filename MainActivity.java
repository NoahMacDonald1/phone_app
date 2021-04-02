package com.example.a387_button_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int buttonCnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_pushed(View view) {
        buttonCnt++;
        TextView quantityTextView = (TextView) findViewById(R.id.after_push);
        quantityTextView.setText("Button pushed: " + buttonCnt + " times.");
    }
}