package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText pwText = (EditText) findViewById(R.id.pwText);
        Button login = (Button) findViewById(R.id.login);
        Button signUp = (Button) findViewById(R.id.SignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(MainActivity.this, RagisterActivity.class);
                MainActivity.this.startActivity(register);
            }
        });
    }





}
