package com.gz.xhb.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.gz.xhb.Base.XHBBaseAdapter;
import com.gz.xhb.Entity.PsBaseInfo;
import com.gz.xhb.R;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class PsListAdapter extends XHBBaseAdapter<PsBaseInfo> {
    public PsListAdapter(Context context, List<PsBaseInfo> list) {
        super(context, list);
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

