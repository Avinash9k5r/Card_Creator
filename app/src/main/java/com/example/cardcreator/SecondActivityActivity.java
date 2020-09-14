package com.example.cardcreator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SecondActivityActivity extends AppCompatActivity {


    public void createAnother(View view) {
        Intent newIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(newIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView from = findViewById(R.id.from);
        TextView to = findViewById(R.id.to);
        TextView heading = findViewById(R.id.heading);
        TextView message = findViewById(R.id.message);

        Intent intent = getIntent();

        String fromView = intent.getStringExtra("from1");
        String toView = intent.getStringExtra("to2");
        String headingView = intent.getStringExtra("heading3");
        String messageView = intent.getStringExtra("message4");

        Log.i("info", fromView);


        from.setText(fromView);
        to.setText(toView);

        heading.setText(headingView);
        message.setText(messageView);

    }
}
