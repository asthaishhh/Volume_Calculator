package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapesArrayList;
    Context context;


    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList=shapesArrayList;
        this.context=context;
    }

    // ViewHolder : used to catch references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        // 1 - get the shape object for the current position
        Shape shapes = getItem(position);

        //2 - inflating layout
        MyViewHolder myViewHolder;

        if(convertView==null){
            // no view went off-screen --> create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );
            // finding the views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg =(ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(myViewHolder);



        }else{
            // a view went off screen --> re-use it

            myViewHolder =(MyViewHolder) convertView.getTag();
        }
        // getting data from the data source
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());
        return convertView;
    }
}
