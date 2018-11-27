package com.example.proyectopdam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.example.proyectopdam.Entity.Curso;
import com.example.proyectopdam.Entity.Receta;

public class PerfilCurso extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_curso);
        this.setTitle("Curso");
        Curso curso10 = new Curso("Bebidas", null, "No disponible","8:00 am",null);
    }

    public void inscribirse(View view) {
        startActivity(new Intent(PerfilCurso.this, ListaCursos.class));
        Toast toast = Toast.makeText(getApplicationContext(),
                "Se inscribio exitosamente al curso",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
