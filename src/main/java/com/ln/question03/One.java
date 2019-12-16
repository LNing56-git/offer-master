package com.ln.question03;

/**
 * 二维数组中查找
 * @author lining
 * @since 2019/9/2
 */
public class One {
    public boolean find(int arry[][],int target) {
        int row=arry.length-1;
        int colmn=arry[0].length;
        if (row==0||colmn==0) return false;
        boolean flag=false;
        for(int i=row;i>=0;i-- ){
            if(target<arry[0][i]){
                continue;
            }
            for(int j=0;j<colmn;j++){
                if(arry[j][i]<target){
                    continue;
                }
                if(arry[j][i]==target){
                    System.out.println("数字"+target+"坐标为（"+(j+1)+","+(i+1)+")");
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

        public static void main (String[]args){
            int a[][] = {
                    {1, 2, 8, 9},
                    {2, 4, 9, 12},
                    {4, 7, 10, 13},
                    {6, 8, 11, 15}
            };
//        System.out.println(a.length); a.length为行的长度
//        System.out.println(a[1].length);a[i].length为列的长度
            One one = new One();
            System.out.println(one.find(a,7));

        }

    }