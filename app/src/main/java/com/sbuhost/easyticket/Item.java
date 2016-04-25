package com.sbuhost.easyticket;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Item extends AppCompatActivity {

    private HorizontalListView listView;
    private PurchaseFragment purchaser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        listView = (HorizontalListView) findViewById(R.id.hListView);
        ThumbItemAdapter adapter = new ThumbItemAdapter(this);
        listView.setAdapter(adapter);
    }
    public void buy(View v){
        FragmentManager fm = getSupportFragmentManager();
        purchaser = new PurchaseFragment();
        purchaser.show(fm, "text_here");
    }
    public void loadPoster(View v){

    }
    public void next(View v){
        purchaser.next();
    }
    public void prev(View v){
        purchaser.prev();
    }
    public void toReceivers(View v){
        purchaser.next();
    }
}
