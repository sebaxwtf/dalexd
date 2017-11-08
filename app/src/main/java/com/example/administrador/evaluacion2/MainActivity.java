package com.example.administrador.evaluacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Us;
    EditText Pa;
    String use;
    String pass;
    public static ArrayList<Usuario> listaUsuarios;
    public static ArrayList<Signos> listaSignos = new ArrayList<>();

    Usuario abc1 = new Usuario("vixo","xovi","dale","dale",123);

    ArrayList<Integer> ratita = new ArrayList();
    Signos rata = new Signos(1,"rata",ratita,"wen wena");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (listaUsuarios == null){
            listaUsuarios = new ArrayList<>();
        }

        ratita.add(0,1900);
        ratita.add(1,1912);
        ratita.add(2,1924);
        ratita.add(3,1936);
        ratita.add(4,1948);
        ratita.add(5,1960);
        ratita.add(6,1972);
        ratita.add(7,1984);
        ratita.add(8,1996);
        ratita.add(9,2008);

        Signos buey;
        Signos tigre;
        Signos liebre;
        Signos dragon;
        Signos serpiente;
        Signos caballo;
        Signos cabra;
        Signos mono;
        Signos gallo;
        Signos perro;
        Signos jabali;


    }

    public void Logueo (View v){
        listaUsuarios.add(abc1);
        listaSignos.add(rata);
        Us = (EditText) findViewById(R.id.User);
        Pa = (EditText) findViewById(R.id.Pass);
        use = Us.getText().toString();
        pass = Pa.getText().toString();
        Intent i = new Intent(this, Resultado.class);


          for(Usuario u : listaUsuarios){
              if(u.getCorreo().equals(use) && u.getPassword().equals(pass)){
                  i.putExtra("nombrecito", u.getNombre());
                  startActivity(i);
              }
          }


    }

    public void Registrar (View v){
        Intent i = new Intent(this, Registro.class);

        startActivity(i);
    }
}
