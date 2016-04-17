package com.sbuhost.easyticket;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Events extends ActionBarActivity{
    private ListView list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        list=(ListView)findViewById(R.id.list);
        ItemAdapter adapter = new ItemAdapter(this);
        list.setAdapter(adapter);
    }
    public void share(View v){
        Toast.makeText(this, "sharing", Toast.LENGTH_SHORT).show();
    }
    public void showLocation(View v){
        Toast.makeText(this, "showing location", Toast.LENGTH_SHORT).show();
    }
    public void checkout(View v){
        Toast.makeText(this, "checking out", Toast.LENGTH_SHORT).show();
    }
    public void openMore(View v){
        Toast.makeText(this, "opening", Toast.LENGTH_SHORT).show();
    }
}
