package com.example.mitema2onlinefragmento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.nio.file.Files;

public class DetalleCorreo extends AppCompatActivity {
    String de;
    String asunto;
    String texto;
    TextView detalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        Bundle extras = getIntent().getExtras();
        de= extras.getString("de");
        asunto = extras.getString("asunto");
        texto = extras.getString("texto");
        detalle = findViewById(R.id.txtdetalle);
        detalle.setText("de: " + de + "contiene el asunto: "+ asunto + "con el contenido: "+ texto);


    }
}
