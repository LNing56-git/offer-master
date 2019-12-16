package com.ln.question11;

public class Power {

    public static double power(double base,int exponent){
        if(equal(base,0.0)||exponent<0){
            throw new RuntimeException("输出有误");
        }
        double result = 1.0;
        if(exponent<0){
            exponent = - exponent;
            for(int i=1;i<=exponent;i++){
                result *=base;
            }
            result /=1;
        }else if(exponent ==0){

        }else {
            for(int i=1;i<=exponent;i++){
                result *=base;
            }
        }
        return result;
    }

    public static boolean equal(double a ,double b){
        if(a-b<0.000001&&b-a<0.000001){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(0,0));
    }
}
