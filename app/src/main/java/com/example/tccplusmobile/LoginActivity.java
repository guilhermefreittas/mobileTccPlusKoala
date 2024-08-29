package com.example.tccplusmobile;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inicializar os componentes da interface
        editEmail = findViewById(R.id.edit_email);
        editPassword = findViewById(R.id.edit_password);
        btnLogin = findViewById(R.id.btn_login);

        // Configurar o botão de login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });
    }

    private void performLogin() {
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();

        // Verificar se os campos estão preenchidos
        if (TextUtils.isEmpty(email)) {
            editEmail.setError("Email is required");
            editEmail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            editPassword.setError("Password is required");
            editPassword.requestFocus();
            return;
        }

        // Aqui você pode adicionar a lógica de autenticação
        // Por exemplo, verificar o email e senha com um banco de dados ou servidor

        if (email.equals("user@example.com") && password.equals("password123")) {
            // Login bem-sucedido
            Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
            // Aqui você pode iniciar uma nova atividade ou fazer algo após o login bem-sucedido
        } else {
            // Falha no login
            Toast.makeText(LoginActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }
    public void openCadastroActivity(View view) {
        Intent intent = new Intent(this, CadastroAlunoActivity.class);
        startActivity(intent);
    }

}
