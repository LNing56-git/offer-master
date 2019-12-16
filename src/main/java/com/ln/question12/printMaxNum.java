package com.ln.question12;

/**
 * @author lining
 * @since 2019/9/17
 * @Descripiton 输入数字n,按顺序打印出从1最大的n位十进制数
 */
public class printMaxNum {
    /**
     * 最大位
     * @param n
     */
    public static void maxDigit(int n){
        int num[] = new  int [n];
        for(int i=0;i<=9;i++){
            num[0]=i;
            enumByRec(num,1);
        }
    }

    /**
     * 递归输出 先通过index走到数组的末端 执行完打印方法printBySh方法后 继续执行enumByRec中的循环 通过i的+1操作实现数字的+1操作
     * @param num
     * @param index
     */
    public static void enumByRec(int num[],int index){
        if(index==num.length){
            printBySh(num);
            return;
        }
        for(int i=0;i<10;i++){
            num[index]=i;
            enumByRec(num,index+1);
        }

    }

    public static void printBySh(int num[]){
        boolean flag = true;
        for(int i=0;i<num.length;i++){
            if(num[i]!=0&&flag){
                flag = false;
            }
            if(!flag){
                System.out.print(num[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        maxDigit(4);
    }
}
