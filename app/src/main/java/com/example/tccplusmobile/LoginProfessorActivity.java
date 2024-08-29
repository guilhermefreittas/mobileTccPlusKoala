package com.example.tccplusmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginProfessorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_professor);

        findViewById(R.id.btn_login_professor).setOnClickListener(v -> {
            // Handle login logic for professor
        });


    }

    public void openCadastroProfessorActivity(View view) {
        Intent intent = new Intent(this, CadastroProfessorActivity.class);
        startActivity(intent);
    }
}
