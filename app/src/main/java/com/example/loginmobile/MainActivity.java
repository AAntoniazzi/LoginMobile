package com.example.loginmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = findViewById(R.id.user);
        final EditText password = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        final TextView alert = findViewById(R.id.alert);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("aramys") && password.getText().toString().equals("aramys")) {
                    alert.clearComposingText();
                    alert.setText("Logado com Sucesso");
                } else if (user.getText().toString().equals("") || password.getText().toString().equals("")) {
                    alert.setText("Informar Login e Senha");
                } else {
                    alert.setText("Usuário ou Senha inválido");
                }
            }
        });
    }
}