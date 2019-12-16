package com.ln.question24;

/**
 * @author lining
 * @since 2019/10/8
 * 通过递归，先找出前面第一个比末尾的根节点
 * 大的坐标，再判断后面是否有比该根节点小的
 * 如果有则不是二叉搜索树的后序遍历
 */
public class VerifySquenceOfBST {
    public boolean Verify(int [] arr,int start,int end){
        if(end-start==0||end-start<0||arr==null){
            return true;
        }
        int root = arr[end];
        int i=start;
        for(;i<end;i++){
            if(arr[i]>root){
                break;
            }
        }
        int j=i;
        for(;j<end;j++){
            if(arr[j]<root){
                return false;
            }
        }
        boolean leftFlag= true,rightFlag = true;
        leftFlag = Verify(arr,start,j-1);
        rightFlag = Verify(arr,j,end-1);
        return leftFlag&&rightFlag;

    }


    public static void main(String[] args) {
        int[] a = {5,13,6,9,11,10,8};
        VerifySquenceOfBST verifySquenceOfBST = new VerifySquenceOfBST();
        System.out.println(verifySquenceOfBST.Verify(a,0,a.length-1));
    }
}
