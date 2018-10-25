package com.example.proyectopdam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ListaCursos.class));
    }

    public void registrarse(View view) {
        startActivity(new Intent(MainActivity.this, CrearUsuario.class));
    }
}
