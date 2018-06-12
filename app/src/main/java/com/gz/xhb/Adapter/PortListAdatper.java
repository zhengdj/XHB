package com.gz.xhb.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.gz.xhb.Entity.PortInfo;
import com.gz.xhb.Entity.PortInfo;
import com.gz.xhb.R;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class PortListAdatper extends BaseAdapter {

    private Context context;
    private List<PortInfo> list;
    private LayoutInflater inflater;
//    private ListView listView;
    private List<String> fileIds;

    public PortListAdatper(Context context, List<PortInfo> list) {
        this.context=context;
        this.list=list;
//        this.listView=listView;
        inflater= LayoutInflater.from(context);
    }

    public void onDateChange(List<PortInfo> list) {
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
            convertView=inflater.inflate(R.layout.item_port_list, null);
            holder=new ViewHolder();
            ((TextView)convertView.findViewById(R.id.view_outputcode).findViewById(R.id.tv_left_question)).setText("监控点编号");
            holder.outputcode = (TextView) convertView.findViewById(R.id.view_outputcode).findViewById(R.id.tv_right_answer);
            convertView.setTag(holder);
        }
        holder=(ViewHolder)convertView.getTag();
        final PortInfo portInfo=list.get(position);
        holder.outputcode.setText(portInfo.getOutputcode());
        return convertView;
    }



    class ViewHolder{
        TextView outputcode;
    }
}

