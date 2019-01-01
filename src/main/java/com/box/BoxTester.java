package com.box;

import java.util.HashMap;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        float length;
        float width;
        float height;
        String[] sizeNames={"length","width","height"};
        HashMap<String,Float> sizeValues = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< sizeNames.length ; i++)
        {
            System.out.print("Please enter object's "+sizeNames[i]+":");
            sizeValues.put(sizeNames[i],scanner.nextFloat());
        }
        length = sizeValues.get("length");
        width = sizeValues.get("width");
        height = sizeValues.get("height");
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        if (box5.validate(length,width,height)){
            if (box3.validate(length,width,height)){
                System.out.println(box3.getName());
            }else {
                System.out.print(box5.getName());
            }
        }else {
            System.out.println("Box3和Box5尺寸不符合");
        }
    }
}
