package com.example.sargis.homework1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<BmwModel> bmwModelArrayList = BmwProvider.getBmwProviderContent(this);

        final AdapterMyBmw adapterMyBmw = new AdapterMyBmw(this, R.layout.bmw_item_view, bmwModelArrayList);

        ListView listView = findViewById(R.id.myListView);
        listView.setAdapter(adapterMyBmw);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri uri = Uri.parse(bmwModelArrayList.get(position).getContentUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
