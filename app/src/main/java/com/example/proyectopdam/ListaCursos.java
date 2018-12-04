package com.example.proyectopdam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.proyectopdam.Entity.Curso;
import com.example.proyectopdam.Entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ListaCursos extends Activity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        this.setTitle("Cursos populares");
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

        List<String> nombresCurso = new ArrayList<String>();
        List<Curso> cursos = new ArrayList<Curso>();

        /*
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

        */

        Curso curso0 = new Curso("Pasta", null, "No disponible","8:00 am",null);
        Curso curso1 = new Curso("Pizza", null, "No disponible","8:00 am",null);
        Curso curso2 = new Curso("Comidas frias", null, "No disponible","8:00 am",null);
        Curso curso3 = new Curso("Pescados", null, "No disponible","8:00 am",null);
        Curso curso4 = new Curso("Carnes", null, "No disponible","8:00 am",null);
        Curso curso5 = new Curso("Comida china", null, "No disponible","8:00 am",null);
        Curso curso6 = new Curso("Comida italiana", null, "No disponible","8:00 am",null);
        Curso curso7 = new Curso("Lasagna", null, "No disponible","8:00 am",null);
        Curso curso8 = new Curso("Comidas rapidas", null, "No disponible","8:00 am",null);
        Curso curso9 = new Curso("Pasteleria", null, "No disponible","8:00 am",null);
        Curso curso10 = new Curso("Bebidas", null, "No disponible","8:00 am",null);

        cursos.add(curso0);
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);
        cursos.add(curso9);
        cursos.add(curso10);

        for (Curso c : cursos){
            nombresCurso.add(c.getNombre());
        }

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                nombresCurso);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = arrayAdapter.getItem(position);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Se selecciono el curso "+ item,
                        Toast.LENGTH_SHORT);

                toast.show();
                Intent intent = new Intent(ListaCursos.this,PerfilUsuario.class);
                //based on item add info to intent
                startActivity(intent);
            }

        });
    }

    public void perfilPersonal(View view) {
        startActivity(new Intent(ListaCursos.this, PerfilUsuario.class));
    }
}
