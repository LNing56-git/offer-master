package com.ln.question14;

public class ReorderOddEven {
    public static int[] reorder(int target[]){
        int odd[]=new int[target.length],eve[]=new int[target.length];
        int od=0,ev=0;
        for(int i=0;i<target.length;i++){
            if(target[i]%2==0){
                eve[ev]=target[i];
                ev++;
            }else {
                odd[od]=target[i];
                od++;
            }
        }
        for(int i=0;i<target.length;i++){
            if(i<=od){
                target[i]=odd[i];
            }else {
                target[i]=eve[i-od-1];
            }
        }
        return target;
    }


    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int result [] = reorder(a);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
