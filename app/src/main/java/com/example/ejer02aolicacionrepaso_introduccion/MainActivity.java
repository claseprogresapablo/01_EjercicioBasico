package com.example.ejer02aolicacionrepaso_introduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // ZONA DE DEFINICION DE VARIABLES DE TIPO VISTA
    private EditText txtNombre;
    private Button btnReset;
    private Button btnSaludar;
    private TextView txtSaludo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //INICIALIZAR LAS VARIABLES
        inicializarVistas();


        //CREAR ACCIONES
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSaludo.setText("");
                txtNombre.setText("");
                Toast.makeText(MainActivity.this, "Saludo borrado", Toast.LENGTH_SHORT).show();

            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Escribe un nombre", Toast.LENGTH_SHORT).show();

                } else {

                    txtSaludo.setText("Hola "+txtNombre.getText()+" como estas ");

                }
            }
        });






    }

    private void inicializarVistas() {

        txtNombre = findViewById(R.id.txtNombreMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtSaludo = findViewById(R.id.txtSaludoMain);


    }
}