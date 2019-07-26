package com.dalwadibrothers.kunal.glideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.iv_image1);
        imageView2 = findViewById(R.id.iv_image2);
        imageView3 = findViewById(R.id.iv_image3);

        GlideApp.with(MainActivity.this).load("http://goo.gl/gEgYUd").fitCenter().into(imageView1);

        GlideApp.with(MainActivity.this).load("http://goo.gl/gEgYUd").override(300, Target.SIZE_ORIGINAL).into(imageView2);

        GlideApp.with(MainActivity.this).load("http://goo.gl/gEgYUd").centerCrop().into(imageView3);

    }
}
