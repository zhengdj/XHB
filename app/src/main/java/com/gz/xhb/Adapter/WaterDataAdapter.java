package com.gz.xhb.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gz.xhb.Base.XHBBaseAdapter;
import com.gz.xhb.Entity.OnlineDataInfo;
import com.gz.xhb.Entity.WaterDataInfo;
import com.gz.xhb.R;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14 0014.
 */
public class WaterDataAdapter extends XHBBaseAdapter<OnlineDataInfo<WaterDataInfo>> {


    public WaterDataAdapter(Context context, List<OnlineDataInfo<WaterDataInfo>> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.item_data_water_list, null);
            holder=new ViewHolder();
            holder.view1 = (TextView) convertView.findViewById(R.id.item1);
            holder.view2 = (TextView) convertView.findViewById(R.id.item2);
            holder.view3 = (TextView) convertView.findViewById(R.id.item3);
            holder.view4 = (TextView) convertView.findViewById(R.id.item4);
            convertView.setTag(holder);
        }
        holder=(ViewHolder)convertView.getTag();
        OnlineDataInfo<WaterDataInfo> onlineDataInfo = list.get(position);
        final WaterDataInfo waterDataInfo= onlineDataInfo.getT();
        holder.view1.setText(waterDataInfo.getTest1());
        holder.view2.setText(waterDataInfo.getTest2());
        holder.view3.setText(waterDataInfo.getTest3());
        holder.view4.setText(waterDataInfo.getTest4());
        convertView.setBackgroundColor(onlineDataInfo.getColor());
        if(onlineDataInfo.getHeight()!=-1){
            LinearLayout linearLayout =  convertView.findViewById(R.id.ll_itemWaterData);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
            layoutParams.height = onlineDataInfo.getHeight();
            linearLayout.setLayoutParams(layoutParams);
        }
        return convertView;
    }

    class ViewHolder{
        TextView view1;
        TextView view2;
        TextView view3;
        TextView view4;
    }
}

