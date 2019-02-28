package com.yuriko.gulinproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yuriko.gulinproject.R;
import com.yuriko.gulinproject.bean.HeadBean;

import java.util.List;

public class HeadAdapter extends BaseAdapter {
        private List<HeadBean> list;
        private Context context;

        public HeadAdapter(List<HeadBean> list, Context context) {
                this.list = list;
                this.context = context;
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
                        convertView= LayoutInflater.from(context).inflate(R.layout.head_item,null);
                        holder=new ViewHolder();
                        holder.tvHeadItemContent=(TextView)convertView.findViewById(R.id.tvHeadItemContent);
                        convertView.setTag(holder);
                }else{
                        holder= (ViewHolder) convertView.getTag();
                }
                holder.tvHeadItemContent.setText(list.get(position).getName());
                return convertView;
        }

        static class ViewHolder{
                TextView tvHeadItemContent;
        }
}
