package com.box;

public class Box {
    float length;
    float width;
    float height;
    String name;

    public boolean validate(float length,float width, float height){
        return length <= this.length && width <= this.width && height <= this.height ;
    }

    public String getName() {
        return name;
    }
}
