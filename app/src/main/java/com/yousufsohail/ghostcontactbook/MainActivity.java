package com.yousufsohail.ghostcontactbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yousufsohail.ghostcontactbook.dal.MockData;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;
    MyAdapter myAdapter;
    LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        myRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(mLayoutManager);

        myAdapter = new MyAdapter(MockData.ITEMS);
        myRecyclerView.setAdapter(myAdapter);
    }
}
