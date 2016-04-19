package com.sbuhost.easyticket;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

public class Item extends Activity {

    private HorizontalListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        listView = (HorizontalListView) findViewById(R.id.hListView);
        ThumbItemAdapter adapter = new ThumbItemAdapter(this);
        listView.setAdapter((ListAdapter)adapter);
    }
    public void buy(View v){}
}
