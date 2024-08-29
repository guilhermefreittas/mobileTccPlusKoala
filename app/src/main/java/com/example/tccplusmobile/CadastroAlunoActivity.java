package com.example.tccplusmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroAlunoActivity extends AppCompatActivity {

    private EditText editEmail, editNome, editRm, editTurma;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);



        editEmail = findViewById(R.id.edit_email);
        editNome = findViewById(R.id.edit_nome);
        editRm = findViewById(R.id.edit_rm);
        editTurma = findViewById(R.id.edit_turma);
        btnCadastrar = findViewById(R.id.btn_cadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarAluno();
            }
        });

    }

    private void cadastrarAluno() {
        String email = editEmail.getText().toString();
        String nome = editNome.getText().toString();
        String rm = editRm.getText().toString();
        String turma = editTurma.getText().toString();

        // Aqui você pode implementar a lógica para salvar os dados do aluno
        // Por exemplo, enviar para um servidor ou salvar localmente

        Toast.makeText(CadastroAlunoActivity.this, "Aluno cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
        finish(); // Fechar a atividade após o cadastro
    }

}

