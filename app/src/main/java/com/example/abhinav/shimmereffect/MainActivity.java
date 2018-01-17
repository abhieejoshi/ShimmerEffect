package com.example.abhinav.shimmereffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ethanhua.skeleton.Skeleton;
import com.ethanhua.skeleton.SkeletonScreen;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL,false));
        MyAdapter myAdapter = new MyAdapter();

        final SkeletonScreen skeletonScreen = Skeleton.bind(recyclerView)
                .adapter(myAdapter)
                .shimmer(true)
                .angle(20)
                .duration(1200)
                .count(10)
                .load(R.layout.previewrow)
                .show();
        recyclerView.postDelayed(new Runnable() {
            @Override
            public void run() {
                skeletonScreen.hide();
            }
        },7000);
    }
}
