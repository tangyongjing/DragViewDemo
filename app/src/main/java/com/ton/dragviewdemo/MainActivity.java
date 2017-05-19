package com.ton.dragviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends AppCompatActivity {

    private DragView mDragView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化ImageLoader
        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(MainActivity.this));
        setContentView(R.layout.activity_main);
        mDragView = (DragView) findViewById(R.id.dragview);
//        mDragView.setImageResource(R.mipmap.ic_launcher);
        mDragView.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1495193578123&di=1356056ae967c04aa8b2d75a8634e7a0&imgtype=0&src=http%3A%2F%2Fs15.sinaimg.cn%2Fmw690%2F001MXOZUgy6DUbyFxgy7e%26690");
    }
}
