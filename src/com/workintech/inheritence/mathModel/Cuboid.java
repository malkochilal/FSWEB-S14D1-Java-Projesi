package com.workintech.inheritence.mathModel;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width,double length,double height){
        super(width, length);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }


}
