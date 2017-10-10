package com.saccity362.scccismobiledesignclassportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Capture the layouts TextView ms set the string as Text
        TextView textView = (TextView) findViewById(R.id.textView);
        message = "Welcome to Mobile Developer Page " + message;
        textView.setText(message);
    }
}

