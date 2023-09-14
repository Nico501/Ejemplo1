package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView lblNumeroVecesMain;
    Button btnBotonMain;
    Button btnResetearMain;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;

        inicializarVistas();
        btnBotonMain.setOnClickListener(new View.OnClickListener() { // AÑADIR +1 AL PRESIONAR
            @Override
            public void onClick(View view) {
                contador++;
                lblNumeroVecesMain.setText(String.valueOf(contador)); //Pasarlo a String
                if(contador == 20){
                    Toast.makeText(MainActivity.this, "+1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnResetearMain.setOnClickListener(new View.OnClickListener() { //RESETEAR CONTADOR Y LABEL
            @Override
            public void onClick(View view) {
                contador = 0;
                lblNumeroVecesMain.setText("0");
            }
        });
    }

    private void inicializarVistas() { //INICIALIZAR LAS COSAS
        lblNumeroVecesMain = findViewById(R.id.lblNumeroVecesMain);
        btnBotonMain = findViewById(R.id.btnBotonMain);
        btnResetearMain = findViewById(R.id.btnResetearMain);
    }

   /* public void contar(View view){ // Como NO hay que hacerlo
        contador++;
        lblNumeroVecesMain.setText(contador + " veces");
    }*/
}