package com.yousufsohail.ghostcontactbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.yousufsohail.ghostcontactbook.dal.MockData;
import com.yousufsohail.ghostcontactbook.network.ApiClient;
import com.yousufsohail.ghostcontactbook.network.GetUserListResponse;
import com.yousufsohail.ghostcontactbook.network.GhostUserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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


        getContacts();


    }

    private void getContacts() {

        //https://randomuser.me/api/?results=5
        Retrofit client = ApiClient.getClient();

        GhostUserService ghostUserService = client.create(GhostUserService.class);

        Call<GetUserListResponse> ghostUserList = ghostUserService.getGhostUserList(5);


        ghostUserList.enqueue(new Callback<GetUserListResponse>() {
            @Override
            public void onResponse(Call<GetUserListResponse> call, Response<GetUserListResponse> response) {

                Log.d("MainActivity", response.message());
            }

            @Override
            public void onFailure(Call<GetUserListResponse> call, Throwable t) {

            }
        });

    }
}
