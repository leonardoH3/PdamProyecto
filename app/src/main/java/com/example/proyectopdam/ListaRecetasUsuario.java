package com.example.proyectopdam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaRecetasUsuario extends Activity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_recetas_usuario);
        this.setTitle("Recetas Usuario");
        lv = (ListView) findViewById(R.id.listaRecetasUsuario);



        List<String> recetas = new ArrayList<String>();
        recetas.add("Pato a la naranja");
        recetas.add("Arroz con pollo");
        recetas.add("Arroz a la cubana");
        recetas.add("Espaguetis a la carbonara");
        recetas.add("Macarrones con carne picada y tomate ");
        recetas.add("Espaguetis al pesto");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                recetas );

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = arrayAdapter.getItem(position);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Se selecciono la receta "+ item,
                        Toast.LENGTH_SHORT);

                toast.show();
                Intent intent = new Intent(ListaRecetasUsuario.this,MainActivity.class);
                //based on item add info to intent
                startActivity(intent);
            }

        });
    }
}
