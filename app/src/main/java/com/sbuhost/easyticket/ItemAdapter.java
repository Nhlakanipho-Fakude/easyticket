package com.sbuhost.easyticket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ItemAdapter extends BaseAdapter {
    String [] result;
    Context context;
    private static LayoutInflater inflater=null;
    public ItemAdapter(Context context) {
        // TODO Auto-generated constructor stub
        this.context = context;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView==null)
            view = inflater.inflate(R.layout.event_list_item, parent, false);
        return view;
    }

}
