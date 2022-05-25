package com.example.principalactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText numeroPension;
    private EditText codigoAdeudo;
    private EditText anio;
    private Spinner cajaOpciones;
    private Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroPension = findViewById(R.id.numero_pension);
        codigoAdeudo = findViewById(R.id.codigo_adeudo);
        anio = findViewById(R.id.anio);
        cajaOpciones = findViewById(R.id.caja_meses);
        btnBuscar = findViewById(R.id.btn_buscar);

        String[] opciones = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        ArrayAdapter<String> meses = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        cajaOpciones.setAdapter(meses);
    }
}