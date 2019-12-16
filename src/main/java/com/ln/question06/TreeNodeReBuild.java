package com.ln.question06;
/**
 * @title 利用前序二叉树和中序二叉树重构该二叉树
 * @Descripton
 */
public class TreeNodeReBuild {
    public TreeNode reBulider(char pre[],char mid[],int preStart,int preEnd,int midStart,int midEnd){
            if(preStart>=preEnd||midStart>=midEnd){
                return null;
            }
            int rootIndex=0;
            for(int i=midStart;i<midEnd;i++){
                if (mid[i] == pre[preStart]) {
                    rootIndex = i;
                    break;
                }}
            TreeNode root = new TreeNode(pre[preStart]);
            int leftRang = rootIndex - midStart;
            root.leftNode=reBulider(pre,mid,preStart+1,preStart+leftRang+1,midStart,midStart+leftRang);
            root.rightNode=reBulider(pre,mid,preStart+leftRang+1,preEnd,midStart+leftRang+1,midEnd);
            return root;

    }

    /**
     * 前序遍历二叉树，先打印父节点再打印左，右节点
     * @param root
     */
    public void prePrint(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.getData()+" ");
        prePrint(root.leftNode);
        prePrint(root.rightNode);
    }

    /**
     * 中序遍历二叉树，先打印左子树再打印根节点最后右边子树
     * @param treeNode
     */
    public void midPrint(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        midPrint(treeNode.leftNode);
        System.out.print(treeNode.getData()+"  ");
        midPrint(treeNode.rightNode);
    }
    public void nextPrint(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        nextPrint(treeNode.leftNode);
        nextPrint(treeNode.rightNode);
        System.out.println(treeNode.getData());
    }
    public static void main(String[] args) {
        char pre[]={'A','B','C','D','E','F'};
        char mid[]={'C','B','A','E','D','F'};
        TreeNodeReBuild treeNodeReBuild = new TreeNodeReBuild();
        treeNodeReBuild.prePrint(treeNodeReBuild.reBulider(pre,mid,0,pre.length,0,mid.length));
        System.out.println();
        treeNodeReBuild.midPrint(treeNodeReBuild.reBulider(pre,mid,0,pre.length,0,mid.length));
    }

}
