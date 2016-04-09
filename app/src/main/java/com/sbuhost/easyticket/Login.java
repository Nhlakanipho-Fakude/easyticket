package com.sbuhost.easyticket;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity {
private Button loginB,signupB,forgotB;
private EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginB=(Button) findViewById(R.id.login);
        signupB=(Button) findViewById(R.id.signup);
        forgotB=(Button) findViewById(R.id.forgot);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);


    }
    public void login(View v) {
        startActivity(new Intent(Login.this,Home.class));
        finish();
    }

    public void signUp(View v){

        Toast.makeText(getApplication()," comming soon", Toast.LENGTH_LONG).show();
    }
    public void forgotPassword(View v){
        Toast.makeText(getApplication()," comming soon", Toast.LENGTH_LONG).show();

    }
}
