package com.sbuhost.easyticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
