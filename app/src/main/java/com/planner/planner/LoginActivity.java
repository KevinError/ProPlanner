package com.planner.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userNameEditTexT = (EditText) findViewById(R.id.userNameEditText);
        final EditText passwordEditTexT = (EditText) findViewById(R.id.passwordEditText);

        final Button registerButton = (Button) findViewById(R.id.loginButton);

        final TextView registerLink = (TextView) findViewById(R.id.registerLink);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });
    }

}
