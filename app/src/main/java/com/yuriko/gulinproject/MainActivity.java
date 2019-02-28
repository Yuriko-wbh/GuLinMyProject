package com.yuriko.gulinproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;

import com.yuriko.gulinproject.adapter.HeadAdapter;
import com.yuriko.gulinproject.bean.HeadBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private ListView lvGulinContent;
        private List<HeadBean> list;
        private HeadAdapter listAdapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                initView();
        }

        private void initView() {
                lvGulinContent = (ListView) findViewById(R.id.lvGulinContent);
                list=new ArrayList<>();
                listAdapter=new HeadAdapter(list,this);
                lvGulinContent.setAdapter(listAdapter);
        }
}
