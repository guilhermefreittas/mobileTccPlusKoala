package com.example.tccplusmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroProfessorActivity extends AppCompatActivity {

    private EditText editEmailInstitucional, editNome, editMatricula, editSenha, editConfirmarSenha;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_professor);

        ImageView ivHome = findViewById(R.id.iv_home);
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Voltar para a tela anterior
            }
        });

        editEmailInstitucional = findViewById(R.id.edit_email_institucional);
        editNome = findViewById(R.id.edit_nome);
        editMatricula = findViewById(R.id.edit_matricula);
        editSenha = findViewById(R.id.edit_senha_professor);
        editConfirmarSenha = findViewById(R.id.edit_confirmar_senha_professor);
        btnCadastrar = findViewById(R.id.btn_cadastrar_professor);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarProfessor();
            }
        });

        // Outras configurações necessárias
    }

    private void cadastrarProfessor() {
        String email = editEmailInstitucional.getText().toString().trim();
        String nome = editNome.getText().toString().trim();
        String matricula = editMatricula.getText().toString().trim();
        String senha = editSenha.getText().toString().trim();
        String confirmarSenha = editConfirmarSenha.getText().toString().trim();

        // Implemente aqui a lógica para validar os campos e cadastrar o professor
        // Por exemplo, verificar se os campos estão preenchidos corretamente e se as senhas coincidem

        // Exemplo simples de validação (não esqueça de implementar a lógica apropriada)
        if (email.isEmpty() || nome.isEmpty() || matricula.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
            // Exibir mensagem de erro ou alerta, se necessário
            return;
        }

        if (!senha.equals(confirmarSenha)) {
            // Exibir mensagem de senhas não coincidem, se necessário
            return;
        }

        // Se todos os campos estiverem corretos, proceder com o cadastro do professor
        // Implemente aqui a lógica para realizar o cadastro (exemplo: enviar para um servidor, etc.)
    }
}
