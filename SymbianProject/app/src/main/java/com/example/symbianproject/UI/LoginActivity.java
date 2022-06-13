package com.example.symbianproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.symbianproject.R;
import com.example.symbianproject.model.Usuario;
import com.example.symbianproject.remote.ApiUtil;
import com.example.symbianproject.remote.RouterInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    TextView tvCdastrar;
    EditText etEmail, etNome;

    Button btnLogar;

    RouterInterface routerInterface;

    List<Usuario> listUsuario = new ArrayList<Usuario>();

    public static int idUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        routerInterface = ApiUtil.getApiInterface();

        tvCdastrar = findViewById(R.id.tvLogin_Cadastrar);
        etNome = findViewById(R.id.etLogin_Nome);
        etEmail = findViewById(R.id.etLogin_Email);

        btnLogar = findViewById(R.id.btnLogin_Logar);

        tvCdastrar.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, CadastroActivity.class));
        });

        btnLogar.setOnClickListener(view -> {
            Call<List<Usuario>> listarUsuario = routerInterface.getUsuarios();
            listarUsuario.enqueue(new Callback<List<Usuario>>() {
                @Override
                public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {

                    if (response.isSuccessful()){

                        listUsuario = response.body();

                        for (int i = 0; i < listUsuario.size(); i++){

                            if (listUsuario.get(i).getNomeUsuario().equals(etNome.getText().toString()) && listUsuario.get(i).getEmailUsuario().equals(etEmail.getText().toString())){

                                idUsuario = listUsuario.get(i).getIdUsuario();
                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.putExtra("idUsuario", idUsuario);
                                startActivity(intent);
                            }

                        }
                    }
                }

                @Override
                public void onFailure(Call<List<Usuario>> call, Throwable t) {
                    Log.d("Debugando", "onFailure: " + t.getMessage());
                }
            });
        });


    }
}