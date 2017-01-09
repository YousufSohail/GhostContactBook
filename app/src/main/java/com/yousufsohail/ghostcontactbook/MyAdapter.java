package com.yousufsohail.ghostcontactbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yousufsohail.ghostcontactbook.dal.MockData;

import java.util.List;

/**
 * Created by Yousuf Sohail on 05-Jan-17.
 */

public class MyAdapter extends RecyclerView.Adapter {

    List<MockData.MockItem> mItems;

    public MyAdapter(List<MockData.MockItem> items) {
        super();
        mItems = items;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
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

            myholder.mItem = mItems.get(position);
            myholder.mIdView.setText(mItems.get(position).id);
            myholder.mContentView.setText(mItems.get(position).content);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public MockData.MockItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.item_id);
            mContentView = (TextView) view.findViewById(R.id.item_name);
        }
    }
}
