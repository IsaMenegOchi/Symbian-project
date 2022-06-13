package com.example.symbianproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.symbianproject.R;
import com.example.symbianproject.model.Usuario;
import com.example.symbianproject.remote.ApiUtil;
import com.example.symbianproject.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroActivity extends AppCompatActivity {

    EditText etNome, etSobrenome, etEmail, etCelular;
    Button btnCadadastro;

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = findViewById(R.id.etCadastro_Nome);
        etSobrenome = findViewById(R.id.etCadastro_Sobrenome);
        etEmail = findViewById(R.id.etCadastro_Email);
        etCelular = findViewById(R.id.etCadastro_Celular);

        btnCadadastro = findViewById(R.id.btnCadastro_Cadastrar);

        routerInterface = ApiUtil.getApiInterface();

        btnCadadastro.setOnClickListener(view -> {
            Usuario usuario = new Usuario();
            usuario.setNomeUsuario(etNome.getText().toString());
            usuario.setSobrenomeUsuario(etSobrenome.getText().toString());
            usuario.setEmailUsuario(etEmail.getText().toString());
            usuario.setCelularUsuario(etCelular.getText().toString());

            addUsuario(usuario);
            startActivity(new Intent(CadastroActivity.this, MainActivity.class));
        });
    }

    public void addUsuario (Usuario usuario){
        Call<Usuario> usuarioCall = routerInterface.addUsuarioComum(usuario);
        usuarioCall.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                Toast.makeText(CadastroActivity.this, "Você cadastrou um usuário", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Log.d("Debugando", "onFailure: " + t.getMessage());
            }
        });

    }
}