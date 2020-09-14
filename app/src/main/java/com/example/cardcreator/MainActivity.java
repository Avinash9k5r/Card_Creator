package com.example.cardcreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button create = findViewById(R.id.create);

        final EditText editText1 = findViewById(R.id.editText1);

        final EditText editText2 = findViewById(R.id.editText2);

        final EditText editText3 = findViewById(R.id.editText3);

        final EditText editText4 = findViewById(R.id.editText4);

        Bundle extras = new Bundle();


        create.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                String from = editText1.getText().toString();
                String to = editText2.getText().toString();
                String heading = editText3.getText().toString();
                String message = editText4.getText().toString();

                Intent intent = new Intent(getApplicationContext(), SecondActivityActivity.class);

                intent.putExtra("from1",from);
                intent.putExtra("to2", to);
                intent.putExtra("heading3", heading);
                intent.putExtra("message4", message);

                startActivity(intent);
            }
        });


    }
}