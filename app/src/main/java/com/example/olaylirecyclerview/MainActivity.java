package com.example.olaylirecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.Adapter iconAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<DepoSinif> personUtilsList;
    List<DepoSinif> iconList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        personUtilsList = new ArrayList<>();

        personUtilsList.add(new DepoSinif("Batman", "Bruce Wayne","1"));
        personUtilsList.add(new DepoSinif("Iron Man", "Tony Stark","2"));
        personUtilsList.add(new DepoSinif("Wonder Woman", "Diana Prince","3"));
        personUtilsList.add(new DepoSinif("Superman", "Clark Joseph Kent","4"));
        personUtilsList.add(new DepoSinif("Black Widow", "Natasha Romanoff","5"));
        personUtilsList.add(new DepoSinif("Spiderman", "Peter Parker","6"));
        personUtilsList.add(new DepoSinif("Hulk", "Bruce Banner","7"));
        personUtilsList.add(new DepoSinif("Captan America", "Steven Rogers","8"));
        mAdapter = new CustomRecyclerAdapter(this, personUtilsList);
            recyclerView.setAdapter(mAdapter);

        /*iconList.add(new DepoSinif(R.drawable.batman));
        iconList.add(new DepoSinif(R.drawable.ironman));
        iconList.add(new DepoSinif(R.drawable.wonderwoman));
        iconList.add(new DepoSinif(R.drawable.superman));
        iconList.add(new DepoSinif(R.drawable.favori));
        iconList.add(new DepoSinif(R.drawable.spiderman));
        iconList.add(new DepoSinif(R.drawable.hulk));
        iconList.add(new DepoSinif(R.drawable.captanamaerica));
        iconAdapter = new CustomRecyclerAdapter(this, iconList);
        recyclerView.setAdapter(iconAdapter);*/


    }

}





