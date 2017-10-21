package com.example.android.blessed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button createAccount;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.login);
        createAccount = (Button)findViewById(R.id.createAccount);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), com.example.android.blessed.HomePage.class));
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), com.example.android.blessed.NewAccount1.class));
            }
        });

        email = (EditText)findViewById(R.id.email);
        String inputEmail = email.getText().toString();

        password = (EditText)findViewById(R.id.password);
        String inputPassword = password.getText().toString();
    }
}
