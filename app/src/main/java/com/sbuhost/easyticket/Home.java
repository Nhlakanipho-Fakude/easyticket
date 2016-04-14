package com.sbuhost.easyticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class Home extends ActionBarActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toast.makeText(getApplicationContext(),"Welcome Home",Toast.LENGTH_LONG).show();
    }
    public void launchEvents(View v){
        startActivity(new Intent(this, Events.class));
    }
}
