package com.myowncompany.github_task;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SHASHI on 11-07-2016.
 */

public class DetailsListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Details> mDetailsList;

    public DetailsListAdapter(Context mContext, List<Details> mDetails) {
        this.mContext = mContext;
        this.mDetailsList = mDetails;
    }

    @Override
    public int getCount() {
        return mDetailsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDetailsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(mContext,R.layout.item_product_list,null);
        TextView tv_name= (TextView) view.findViewById(R.id.tv_name);
        TextView tv_commit = (TextView) view.findViewById(R.id.tv_commit);
        TextView tv_message= (TextView) view.findViewById(R.id.tv_message);
        tv_name.setText(mDetailsList.get(position).getName());
        tv_commit.setText(mDetailsList.get(position).getCommit());
        tv_message.setText(mDetailsList.get(position).getMessage());
        view.setTag(mDetailsList.get(position).getId());
        return view;
    }
}
