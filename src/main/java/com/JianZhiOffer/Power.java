package com.JianZhiOffer;

public class Power {
    public double Power(double base, int exponent) {
       if (exponent>=0){
           return qiuJi(base,exponent);
       }else {
           return 1/qiuJi(base,-exponent);
       }
    }
    public double qiuJi(double base,int exponet){
        if (exponet==0){
            return 1;
        }
        if (exponet==1){
            return base;
        }
        double result = Power(base,exponet>>1);
        result *= result;
        if ((exponet & 0x1 )==1){
            result*=base;
        }
        return result;
    }
}
