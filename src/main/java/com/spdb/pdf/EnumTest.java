package com.spdb.pdf;

import com.spdb.utils.Color;

public class EnumTest {

    public static void main(String[] args) {
        for(Color color:Color.values()){
            System.out.println(color.name() + "----" + color.ordinal());
        }
    }
}
