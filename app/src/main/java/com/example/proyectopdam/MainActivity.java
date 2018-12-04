package com.example.proyectopdam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button buttonLogin;
    private EditText editUser,editPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = getIntent();
        Bundle b = in.getExtras();

        editUser = (EditText) findViewById(R.id.editText);
        editPass = (EditText) findViewById(R.id.editText2);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        if(b!=null){
            editUser.setText(b.getString("usuario"));
            editPass.setText(b.getString("password"));
        }


    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(MainActivity.this, ListaCursos.class));
    }

    public void registrarse(View view) {
        startActivity(new Intent(MainActivity.this, CrearUsuario.class));
    }
}
