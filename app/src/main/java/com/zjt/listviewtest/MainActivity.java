package com.zjt.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<IconBean> mIconBeenList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIconBeenList=new ArrayList<>();
        ListView iconList= (ListView) findViewById(R.id.lv);
        initData();
        iconList.setAdapter(new IconAdapter(this,mIconBeenList));
    }

    private void initData() {
        IconBean Add=new IconBean("Add",R.drawable.add);
        mIconBeenList.add(Add);
        IconBean Close=new IconBean("Close",R.drawable.close);
        mIconBeenList.add(Close);
        IconBean Enter=new IconBean("Enter",R.drawable.enter);
        mIconBeenList.add(Enter);
        IconBean FullScreen=new IconBean("FullScreen",R.drawable.fullscreen);
        mIconBeenList.add(FullScreen);
        IconBean Right=new IconBean("Right",R.drawable.right);
        mIconBeenList.add(Right);
        mIconBeenList.add(Right);
        mIconBeenList.add(FullScreen);
        mIconBeenList.add(Enter);
        mIconBeenList.add(Close);
        mIconBeenList.add(Add);
    }
}
