package com.example.proyectopdam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class PerfilUsuario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
    }

    public void misRecetas(View view) {
        Intent intent = new Intent(PerfilUsuario.this,ListaCursos.class);
        startActivity(intent);
    }
}
