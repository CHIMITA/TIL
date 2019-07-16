package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RagisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText) findViewById(R.id.name);
        EditText age = (EditText) findViewById(R.id.age);
        EditText idText = (EditText) findViewById(R.id.idText);
        EditText pwText = (EditText) findViewById(R.id.pwText);
        Button finish = (Button) findViewById(R.id.finish);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RagisterActivity.this, MainActivity.class );
                RagisterActivity.this.startActivity(register);
            }
        });

    }
    }

