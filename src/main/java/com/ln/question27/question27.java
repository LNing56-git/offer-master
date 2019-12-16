package com.ln.question27;

/**
 * @author linig
 * @since 2019/10/15
 * 通过递归中序遍历
 */
public class question27 {
    TreeNode lastNode = null;
    public TreeNode Convert(TreeNode root){

        ConvertNode(root);
        TreeNode head = lastNode;
        while (head.left!=null&head!=null){
            System.out.println(head.value);
            head=head.left;
        }
        return head;
    }
    public void ConvertNode(TreeNode treeNode){


        if(treeNode==null)
            return;
        if(treeNode.left!=null)
            ConvertNode(treeNode.left);
        treeNode.left = lastNode;
        if(lastNode!=null)
            lastNode.right=treeNode;
        lastNode = treeNode;
        if(treeNode.right!=null)
            ConvertNode(treeNode.right);

    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t2.left=t1;
        t2.right=t3;
        question27 question27 = new question27();
        TreeNode treeNode1 = question27.Convert(t2);
        while (treeNode1!=null){
            System.out.println(treeNode1.value);
            treeNode1=treeNode1.right;
        }

    }
}
