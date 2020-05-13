package com.JianZhiOffer;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {

            return Verify(sequence,0,sequence.length-1);

    }
    public boolean Verify(int[] sequence,int start,int end){
        if (start>=end){
            return true;
        }
        int root = sequence[end];
        int i = start;
        for (;i<end;){
            if (sequence[i]<root){
                i++;
            }else {
                break;
            }
        }
        int j = i;

        for (;j<end;j++){
            if (sequence[j]>root){
                j++;
            }else {
                return false;
            }
        }

        return Verify(sequence,start,i-1)&&Verify(sequence,i,end-1);
    }
}
