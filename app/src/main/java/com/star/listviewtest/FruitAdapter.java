package com.star.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int mResourceId;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);

        mResourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Fruit fruit = getItem(position);

        View view;
        ViewHolder viewHolder;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(mResourceId, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.mFruitImage = view.findViewById(R.id.fruit_image);
            viewHolder.mFruitName = view.findViewById(R.id.fruit_name);

            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.mFruitImage.setImageResource(fruit.getImageId());
        viewHolder.mFruitName.setText(fruit.getName());

        return view;
    }

    private class ViewHolder {
        private ImageView mFruitImage;
        private TextView mFruitName;
    }
}
