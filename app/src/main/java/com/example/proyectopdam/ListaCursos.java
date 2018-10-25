package com.example.proyectopdam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaCursos extends Activity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        this.setTitle("Recetas populares");
        lv = (ListView) findViewById(R.id.listaRecetasPopulares);



        /*
        List<Receta> recetas = new ArrayList<Receta>();
        Receta receta1 = new Receta("Pato a la naranja",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        Receta receta2 = new Receta("Estofado",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        Receta receta3 = new Receta("Arroz con pollo",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        Receta receta4 = new Receta("Espaguetis a la boloñesa",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        Receta receta5 = new Receta("Macarrones gratinados con atún",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        Receta receta6 = new Receta("Lasaña de carne",null,"No esta disponible","Leonardo Herrera","No hay pasos");
        recetas.add(receta1);
        recetas.add(receta2);
        recetas.add(receta3);
        recetas.add(receta4);
        recetas.add(receta5);
        recetas.add(receta6);

        ArrayAdapter<Receta> arrayAdapter = new ArrayAdapter<Receta>(
                this,
                android.R.layout.simple_list_item_1,
                recetas );

        lv.setAdapter(arrayAdapter);
         */

        List<String> recetas = new ArrayList<String>();
        recetas.add("Pato a la naranja");
        recetas.add("Estofado");
        recetas.add("Arroz con pollo");
        recetas.add("Espaguetis a la boloñesa");
        recetas.add("Macarrones gratinados con atún");
        recetas.add("Lasaña de carne");
        recetas.add("Pollo en salsa barbacoa");
        recetas.add("Salchichas envueltas en patata");
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

                Intent intent = new Intent(ListaCursos.this,MainActivity.class);
                //based on item add info to intent
                startActivity(intent);
            }

        });
    }

}
