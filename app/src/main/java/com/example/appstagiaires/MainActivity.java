package com.example.appstagiaires;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_LOGIN = "com.example.appstagiaires.LOGIN";
    public static final String EXTRA_PASSWORD = "com.example.appstagiaires.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connexion(View view) {
        String login = ((EditText) findViewById(R.id.login)).getText().toString();
        String password = ((EditText) findViewById(R.id.password)).getText().toString();

        if (!login.equals("admin") && !password.equals("123")) {
            return;
        }

        Intent intent = new Intent(this, ListStagiairesActivity.class);

        intent.putExtra(EXTRA_LOGIN, login);
        intent.putExtra(EXTRA_PASSWORD, password);

        startActivity(intent);
    }
}
