package com.example.proyectopdam;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CrearUsuario extends Activity {

    private EditText editNombre;
    private EditText editUsuario;
    private EditText editEmail;
    private EditText editContrasena;
    private EditText editCoContrasena;
    private Button buttonRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
        editNombre = (EditText) findViewById(R.id.editNombre);
        editUsuario = (EditText) findViewById(R.id.editUsuario);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editContrasena = (EditText)  findViewById(R.id.editContrasena);
        editCoContrasena = (EditText) findViewById(R.id.editCoContrasena);
        buttonRegistrarse = (Button) findViewById(R.id.buttonRegistrarse);

    }

    public void reg(View v) {
        System.out.println(validForm());
        if(!validForm()) {
            if (editNombre.getText() == null || editNombre.getText().length() == 0) {
                editNombre.setError("Falta el nombre");
                System.out.println("Falta el nombre");
            }
            if (editUsuario.getText() == null || editUsuario.getText().length() == 0) {
                editUsuario.setError("Falta el usuario");
                System.out.println("Falta el usuario");
            }
            if (editEmail.getText() == null || editEmail.getText().length() == 0) {
                editEmail.setError("Falta el correo electrónico");
                System.out.println("Falta el correo electrónico");
            }
            if (!isEmailValid(editEmail.getText().toString())) {
                editEmail.setError("Formato incorrecto del correo electrónico");
                System.out.println("Formato incorrecto del correo electrónico");
            }
            if (editContrasena.getText() == null || editContrasena.getText().length() == 0) {
                editContrasena.setError("Falta la contraseña");
                System.out.println("Falta la contraseña");
            }
            if (editCoContrasena.getText() == null || editCoContrasena.getText().length() == 0) {
                editCoContrasena.setError("Falta la confirmación de contraseña");
                System.out.println("Falta la confirmación de contraseña");
            }
            if (!editContrasena.getText().toString().equals(editCoContrasena.getText().toString())) {
                editCoContrasena.setError("Las contraseñas no coinciden");
                System.out.println("las contraseñas no son iguales");
            }
        }else{
            System.out.println("validoooooo");
            registrarUsuario(v);
        }

    }

    private boolean validForm(){
        boolean ans=true;
        ans &= !(editUsuario.getText()==null || editUsuario.getText().length()==0) ;
        ans &= !(editNombre.getText()==null || editNombre.getText().length()==0) ;
        ans &= !(editEmail.getText()==null || editEmail.getText().length()==0) ;
        ans &= !(editEmail.getText()==null || editEmail.getText().length()==0) && isEmailValid(editEmail.getText().toString());
        ans &= !(editContrasena.getText()==null || editContrasena.getText().length()==0);
        ans &= !(editCoContrasena.getText()==null || editCoContrasena.getText().length()==0);
        ans &= editContrasena.getText().toString().equals(editCoContrasena.getText().toString());
        return ans;
    }
    private boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void registrarUsuario(View view) {
        Bundle b = new Bundle();
        b.putString("nombre",editNombre.getText().toString());
        b.putString("usuario",editUsuario.getText().toString());
        b.putString("email",editEmail.getText().toString());
        b.putString("password",editContrasena.getText().toString());
        Intent in = new Intent(CrearUsuario.this,ListaCursos.class);
        in.putExtras(b);
        Toast toast = Toast.makeText(getApplicationContext(),
                "El usuario se creo satisfactoriamente",
                Toast.LENGTH_SHORT);
        toast.show();
        startActivity(in);
    }
}
