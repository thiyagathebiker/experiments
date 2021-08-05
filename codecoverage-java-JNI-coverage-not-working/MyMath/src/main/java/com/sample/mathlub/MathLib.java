package com.sample.mathlub;

public class MathLib {

    public int add(int a, int b){
        int result = native_add1(a,b);//a+b;
        return result;
    }

    static {
        System.loadLibrary("mathlib1");
    }

    public native int native_add1(int x, int y);

}
