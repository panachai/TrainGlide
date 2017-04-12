package com.example.killercon.trainglide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.imageView1);

        Context context = getApplicationContext();

        Glide.with(context)
                .load("http://www.metalbridges.com/wp-content/uploads/2016/05/pokemonSM-1-e1462949488571.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)   //บังคับให้ Glide เซฟรูปทุกขนาด ลง Cache
                .into(imageView);
    }


}
