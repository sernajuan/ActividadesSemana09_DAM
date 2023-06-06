package com.example.ejercicio2;

import static com.example.ejercicio2.R.id.buttonFinalizar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculamos
        btnToast = findViewById(R.id.buttonFinalizar);
        //Evento Click
        btnToast.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonFinalizar){
            Toast.makeText(this, "Matricula Completa", Toast.LENGTH_LONG).show();
        }


    }
}