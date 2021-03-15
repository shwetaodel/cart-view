package com.example.cartview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;

    List<String> titles;
    List<String> prices;
    List<String> sizes;
    List<String> quantities;
    List<Integer> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.dataList);

        titles=new ArrayList<>();
        prices=new ArrayList<>();
        sizes=new ArrayList<>();
        quantities=new ArrayList<>();
        images=new ArrayList<>();

        titles.add("Black Kurti");
        titles.add("Pink Kurti");
        titles.add("Red Kurti");

        prices.add("$40");
        prices.add("$40");
        prices.add("$40");

        sizes.add("L");
        sizes.add("M");
        sizes.add("M");

        quantities.add("1");
        quantities.add("2");
        quantities.add("1");

        images.add(R.drawable.black);
        images.add(R.drawable.pink);
        images.add(R.drawable.red);

        adapter=new Adapter(this,titles,prices,sizes,quantities,images);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);


    }
}