package com.spdb.pdf;

public enum ColorEnumTest {

    RED("red"),BLUE("blue");

    ColorEnumTest(String color){
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        for(ColorEnumTest colorEnumTest:ColorEnumTest.values()){
            System.out.println(colorEnumTest.getColor() + " ---- " + colorEnumTest.ordinal());
        }
    }
}
