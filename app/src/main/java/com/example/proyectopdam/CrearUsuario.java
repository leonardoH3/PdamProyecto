package com.example.proyectopdam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class CrearUsuario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
    }

    public void registrarUsuario(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "El usuario se creo satisfactoriamente",
                Toast.LENGTH_SHORT);
        toast.show();
        startActivity(new Intent(CrearUsuario.this, MainActivity.class));
    }
}
