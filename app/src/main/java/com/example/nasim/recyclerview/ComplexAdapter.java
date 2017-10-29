package com.example.nasim.recyclerview;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by NASIM on 9/25/2017.
 */

public class ComplexAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // The items to display in your RecyclerView
    private ArrayList <Object> items;
private Context context;
    private final int USER = 0, IMAGE = 1;

    // Provide a suitable constructor (depends on the kind of dataset)
    public ComplexAdapter(Context context, ArrayList <Object> items) {
        this.items = items;
        this.context = context;
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.items.size();
    }

    @Override
    public int getItemViewType(int position) {
        //More to come
        Toast.makeText(context, items.get(position).toString(), Toast.LENGTH_LONG).show();
        if (items.get(position) instanceof Stringss) {
        return USER;

    } else if (items.get(position) instanceof car) {
        return IMAGE;
    }
      return -1;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        //More to come

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case IMAGE:
                View v1 = inflater.inflate(R.layout.activity_view_holder3, viewGroup, false);
                viewHolder = new ViewHolder3(v1);
                break;
            case USER:
                View v2 = inflater.inflate(R.layout.activity_view_holder4, viewGroup, false);
                viewHolder = new ViewHolder4(v2);
                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new RecyclerViewSimpleTextViewHolder(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        //More to come
        switch (viewHolder.getItemViewType()) {

            case IMAGE:
                ViewHolder3 vh3 = (ViewHolder3) viewHolder;
                configureViewHolder3(vh3, position);
                break;

            case USER:
                ViewHolder4 vh4 = (ViewHolder4) viewHolder;
                configureViewHolder4(vh4, position);
                break;

            default:

                break;
        }
    }

    private void configureViewHolder3(ViewHolder3 vh3, int position) {

        car car = (car) items.get(position);
        vh3.getLabel1().setText(car.getCarManufactureer());
        vh3.getImageView().setImageResource(car.getCarImage());
    }

    private void configureViewHolder4(ViewHolder4 vh4, int position) {
        Stringss st = (Stringss) items.get(position);


            vh4.getLabel1().setText(st.getCarname());
            vh4.getLabel2().setText(st.getCarManufacturer());



    }

    private class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewSimpleTextViewHolder(View v) {
            super(v);
        }
    }
}