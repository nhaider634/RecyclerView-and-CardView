package com.example.nasim.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class SelectImage extends AppCompatActivity {

    private int [] mImages={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
            R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.r,R.drawable.s,
            R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.p,R.drawable.q,R.drawable.a,R.drawable.b,
            R.drawable.j,R.drawable.n,R.drawable.o

    };

    AdapterImages adapterImages;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_image);

        gridView=(GridView)findViewById(R.id.gridview);

        adapterImages=new AdapterImages(mImages,this);

        gridView.setAdapter(adapterImages);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SelectImage.this, position + "", Toast.LENGTH_SHORT).show();

                Intent intent3 = new Intent();
                intent3.putExtra("img",mImages[position]);
                setResult(1,intent3);
                finish();
            }
        });



    }
}
