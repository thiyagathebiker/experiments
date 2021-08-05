package com.sample.mathlub;

public class MathLib {

    public int add(int a, int b){
        return a+b;
    }

    public int add(String a , String b) throws IllegalArgumentException{
        int c = 0;

        try{
            int aIn = Integer.parseInt(a);
            int bIn = Integer.parseInt(b);
            c = aIn + bIn;
        }catch (NumberFormatException ne){
            throw new IllegalArgumentException("check value");
        }

        return c;
    }
}
