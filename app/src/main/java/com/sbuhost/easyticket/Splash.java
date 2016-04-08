package com.sbuhost.easyticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    Thread.sleep(3000);
                    startActivity(new Intent(Splash.this, Login.class));
                }catch(InterruptedException e){
                    Log.e("SPLASH", e.toString());
                }finally{
                    finish();
                }
            }
        }).start();
    }
}
