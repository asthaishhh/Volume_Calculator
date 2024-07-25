package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1 - AdapterView = gridview
    GridView gridView;

    // 2- data source
    ArrayList<Shape> shapeArrayList;

    // 3 Adapter
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        shapeArrayList= new ArrayList<>();
        Shape s1 = new Shape(R.drawable.img, "Cube");
        Shape s2 = new Shape(R.drawable.img_1 , "Cuboid");
        Shape s3 = new Shape(R.drawable.img_2, "Sphere");
        Shape s4 = new Shape(R.drawable.img_3, "Pyramid");
        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
    }
}