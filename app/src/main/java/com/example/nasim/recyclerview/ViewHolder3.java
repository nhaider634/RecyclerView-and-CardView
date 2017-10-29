package com.example.nasim.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder3 extends RecyclerView.ViewHolder {

    private ImageView ivExample;
    private TextView label1, label2;

    public ViewHolder3(View v) {
        super(v);
        ivExample = (ImageView) v.findViewById(R.id.ivExample);
        label1 = (TextView) v.findViewById(R.id.carName);

    }

    public TextView getLabel1() {
        return label1;
    }

    public void setLabel1(TextView label1) {
        this.label1 = label1;
    }


    public ImageView getImageView() {
        return ivExample;
    }

    public void setImageView(ImageView ivExample) {
        this.ivExample = ivExample;
    }
}