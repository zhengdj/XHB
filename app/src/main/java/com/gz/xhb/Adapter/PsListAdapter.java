package com.gz.xhb.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.R;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class PsListAdapter extends BaseAdapter {

    private Context context;
    private List<PsBaseInfo> list;
    private LayoutInflater inflater;
    private ListView listView;
    private List<String> fileIds;

    public PsListAdapter(Context context, List<PsBaseInfo> list, ListView listView) {
        this.context=context;
        this.list=list;
        this.listView=listView;
        inflater= LayoutInflater.from(context);
    }

    public void onDateChange(List<PsBaseInfo> list) {
        this.list = list;
        this.notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.item_ps_list, null);
            holder=new ViewHolder();
            holder.userName = (TextView) convertView.findViewById(R.id.tv_itemPsList_psName);
            convertView.setTag(holder);
        }
        holder=(ViewHolder)convertView.getTag();
        final PsBaseInfo userInfo=list.get(position);
        holder.userName.setText(userInfo.getPsname());
        return convertView;
    }



    class ViewHolder{
        TextView userName;
    }
}

