package com.example.volumecalculator;
/*
*this class is acting as a model class
* it represents data structure or individual data times that your adapter is going to display */
public class Shape {
    int shapeImg;
    String shapeName;
   public Shape(int shapeImg,String shapeName){
    this.shapeImg=shapeImg;
    this.shapeName=shapeName;
   }
   public int getShapeImg(){
       return shapeImg;
   }
   public void getShapeImg(int shapeImg){
       this.shapeImg=shapeImg;
   }

   public String getShapeName(){
       return shapeName;
   }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
