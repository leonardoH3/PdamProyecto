package com.example.proyectopdam;

import android.os.Bundle;
import android.app.Activity;

import com.example.proyectopdam.Entity.Receta;

public class PerfilReceta extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_receta);
        this.setTitle("Receta");
        Receta receta = new Receta("Arroz con pollo",null,"No esta disponible","Leonardo Herrera","No hay pasos");
    }

}
