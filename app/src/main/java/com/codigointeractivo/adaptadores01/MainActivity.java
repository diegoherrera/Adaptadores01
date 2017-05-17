package com.codigointeractivo.adaptadores01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos("Animal en peligro de morir",1,R.drawable.aguila,"Aguila"));
        Lista.add(new Datos("Animal en peligro de morir",2,R.drawable.ballena,"Ballena"));
        Lista.add(new Datos("Animal en peligro de morir",3,R.drawable.canario,"Canario"));
        Lista.add(new Datos("Animal en peligro de morir",4,R.drawable.camaleon,"Camaleon"));
        Lista.add(new Datos("Animal en peligro de morir",5,R.drawable.gato,"Gato"));
        Lista.add(new Datos("Animal en peligro de morir",6,R.drawable.delfin,"Delfin"));

        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);

        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable) obj);
                startActivity(paso);
            }
        });

    }
}
