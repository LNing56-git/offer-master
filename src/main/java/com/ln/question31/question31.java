package com.ln.question31;

/**
 * @author lining
 * @since 2019/10/24
 */
public class question31 {
    public int FindGreatestSumofSubArray(int[] arry){
        if(arry.length==0){
            return 0;
        }
        int sum = arry[0];
        int maxsum = sum;
        for(int i=1;i<arry.length;i++){
            if(sum<=0){
                sum=arry[i];
            }else {
                sum+=arry[i];
            }
            maxsum = maxsum>sum ? maxsum : sum;
        }
        return maxsum;
    }


    public static void main(String[] args) {
        int [] a = {1,3,-2,3,6,1,-5};
        question31 question31 = new question31();
        System.out.println(question31.FindGreatestSumofSubArray(a));
    }
}
