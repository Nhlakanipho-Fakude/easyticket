package com.sbuhost.easyticket;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
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
    public void buy(View v){

    }
    public void loadPoster(View v){

    }
    public class FireMissilesDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the Builder class for convenient dialog construction
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            // Create the AlertDialog object and return it
            return builder.create();
        }
    }
}
