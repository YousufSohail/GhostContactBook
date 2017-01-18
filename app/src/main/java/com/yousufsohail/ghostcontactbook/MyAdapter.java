package com.yousufsohail.ghostcontactbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yousufsohail.ghostcontactbook.network.User;

import java.util.List;

/**
 * Created by Yousuf Sohail on 05-Jan-17.
 */

public class MyAdapter extends RecyclerView.Adapter {

    List<User> mUsers;

    public MyAdapter(List<User> users) {
        super();
        mUsers = users;
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        MyAdapter.ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof MyAdapter.ViewHolder) {
            MyAdapter.ViewHolder myholder = (ViewHolder) holder;

            User user = mUsers.get(position);

            myholder.mUser = user;
            myholder.mIdView.setText(user.getName().first + " " + user.getName().last);
            myholder.mContentView.setText(user.getPhone());
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public User mUser;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.item_id);
            mContentView = (TextView) view.findViewById(R.id.item_name);
        }
    }
}
