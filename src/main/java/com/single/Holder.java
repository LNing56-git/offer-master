package com.single;

public class Holder {
    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }

    public static  Holder getInstance(){
        return InnerClass.HOLDER;
    }
    private Holder(){

    }
}
