package com.example.symbianproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.symbianproject.R;

public class MainActivity extends AppCompatActivity {

    ImageView ivPato;
    TextView tvOlhaPato, tvLindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPato = findViewById(R.id.ivMain_Pato);
        tvOlhaPato = findViewById(R.id.tvMain_OlharPato);
        tvLindo = findViewById(R.id.tvMain_Lindo);

        tvOlhaPato.setOnClickListener(view -> {
            ivPato.setVisibility(View.VISIBLE);
            tvLindo.setVisibility(View.VISIBLE);
        });
    }
}