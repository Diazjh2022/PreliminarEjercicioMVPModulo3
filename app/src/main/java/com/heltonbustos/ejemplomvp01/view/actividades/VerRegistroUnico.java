package com.heltonbustos.ejemplomvp01.view.actividades;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.heltonbustos.ejemplomvp01.R;

public class VerRegistroUnico extends AppCompatActivity {

    TextView txtRecibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registro_unico);

        txtRecibir = findViewById(R.id.txtRecibir);

        String cod = getIntent().getStringExtra("cod");

        txtRecibir.setText(cod);

    }


}