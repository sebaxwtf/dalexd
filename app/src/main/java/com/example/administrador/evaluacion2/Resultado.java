package com.example.administrador.evaluacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.administrador.evaluacion2.MainActivity.listaUsuarios;
import static com.example.administrador.evaluacion2.MainActivity.listaSignos;


public class Resultado extends AppCompatActivity {

    EditText ano;
    int anos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView name = (TextView) findViewById(R.id.Name);
        String nombre = getIntent().getStringExtra("nombrecito");

        name.setText(nombre);
        ano = (EditText) findViewById(R.id.Ano);

    }

    public void BuscarAno (View v){
        anos =  Integer.valueOf(ano.getText().toString());
        int var =0;
        String jazz =" ";
        Intent i = new Intent(this, Horoscopo.class);
        for (Signos sig : listaSignos){
                if (sig.getAnos().contains(anos)){
                     var = sig.getId();
                    jazz = sig.getDescripcion();
                }
        }

        if (var==0){
            Toast t = Toast.makeText(this,"Error, año inexistente",Toast.LENGTH_LONG);
            t.show();
        }
        else{
            i.putExtra("index",var);
            startActivity(i);
        }


    }
}
