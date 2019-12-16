package com.ln.question18;

public class HasSubTree {
    /**
     * 判断树中是否包含子树
     * 判断根节点是否相等
     * 不相等就返回false
     * 相等就继续检查左右结点是否相等
     * @param root
     * @param child
     * @return
     */
    public static boolean tree1hastree2(TreeNode root,TreeNode child){
//        Boolean flag= false;
        if(child==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.value!=child.value){
                return  false;
        }
        return tree1hastree2(root.leftChild,child.leftChild)&&tree1hastree2(root.rightChild,child.rightChild);
    }

    /**
     * 先从根节点开始判断是否与子树相等
     * 如果不想等先遍历左子树 再遍历右子树
     *
     * @param root
     * @param child
     * @return
     */
    public static boolean Hastree(TreeNode root,TreeNode child){
        boolean flag = false;
        if(root!=null&&child!=null){
            flag = tree1hastree2(root,child);

        if(!flag){
            flag = Hastree(root.leftChild,child);
        }
        if(!flag){
            flag = Hastree(root.rightChild,child);
        }}
        return flag;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.leftChild=t2;
        t1.rightChild=t3;
        t2.leftChild=t4;
        t2.rightChild=t5;
        TreeNode q = new TreeNode(2);
        TreeNode q1 = new TreeNode(4);
        TreeNode q2 = new TreeNode(5);
        q.leftChild=q1;
        q.rightChild=q2;
        System.out.println(Hastree(t1,q));


    }

}
