package com.example.administrador.evaluacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.administrador.evaluacion2.MainActivity.listaSignos;

public class Horoscopo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscopo);
        int var = getIntent().getExtras().getInt("index");
        int jax = var-1;

        switch (var){
            case 1:
                TextView signo = (TextView) findViewById(R.id.descripcion);
                String sign = listaSignos.get(jax).getDescripcion();
                signo.setText(sign);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
        }
    }
}

