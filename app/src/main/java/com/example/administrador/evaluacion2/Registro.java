package com.example.administrador.evaluacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.administrador.evaluacion2.MainActivity.listaUsuarios;

public class Registro extends AppCompatActivity {

    EditText Nomb;
    EditText Apel;
    EditText Corr;
    EditText Passw;
    EditText Nacimie;
    String nom;
    String app;
    String cor;
    String pass;
    int fech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

    }


    public void AgregarUsuario(View v){


        Nomb = (EditText) findViewById(R.id.Nombre);
        Apel = (EditText) findViewById(R.id.Apellido);
        Corr = (EditText) findViewById(R.id.Correo);
        Passw = (EditText) findViewById(R.id.Password);
        Nacimie = (EditText) findViewById(R.id.Nacimiento);

        nom = Nomb.getText().toString();
        app = Apel.getText().toString();
        cor = Corr.getText().toString();
        pass = Passw.getText().toString();
        fech =  Integer.valueOf(Nacimie.getText().toString());




        Intent i = new Intent(this, MainActivity.class);
        Usuario u = new Usuario(nom,app,cor,pass,fech);

            if (!listaUsuarios.contains(u)){
                listaUsuarios.add(u);
                Toast t = Toast.makeText(this,"Registro Exitoso",Toast.LENGTH_LONG);
                t.show();
                startActivity(i);

            }
            else{
                Toast t = Toast.makeText(this,"Campos no validos",Toast.LENGTH_LONG);
                t.show();
            }

    }



}
