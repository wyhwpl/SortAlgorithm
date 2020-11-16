package com.wpl.foreach;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 汪培林
 * @data 2020-11-16  13:08:40
 */
public class TreeNodeForeach {

    /**
     * 创建二叉树
     * @param array
     * @return
     */
    public static TreeNode createBinaryTree(int[] array){

        if(array==null||array.length==0){
            return null;
        }

        TreeNode node = null;
        TreeNode[] nodes = new TreeNode[array.length];
        for(int i=array.length-1;i>=0;i--){


            if(array[i]!=0){
                nodes[i] = new TreeNode(array[i]);
            }

        }

        node = nodes[0];
        for (int i = 0; i < array.length ; i++) {

            if(nodes[i] == null){
                continue;
            }

            int leftIndex = 2 * i + 1;
            int rightIndex = 2* i + 2;

            if(leftIndex>=array.length||nodes[leftIndex]==null){
                nodes[i].left = null;
            }else{
                nodes[i].left = nodes[leftIndex];
            }
            if(rightIndex>=array.length || nodes[rightIndex]==null){
                nodes[i].right = null;
            }else{
                nodes[i].right = nodes[rightIndex];
            }
        }

        return node;
    }

    /**
     * 先序遍历
     * @param node
     */
    public static void preOrder(TreeNode node){

        Stack<TreeNode> stack = new Stack<>();

        while(node!=null||!stack.isEmpty()){

            while(node!=null){
                System.out.print(node.data+" ");
                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty()){
                TreeNode sNode = stack.pop();
                node = sNode.right;
            }
        }

    }

    /**
     * 中序遍历
     * @param node
     */
    public static void midOrder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();

        while(node!=null||!stack.empty()){

            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            if(!stack.empty()){
                TreeNode sNode = stack.pop();
                System.out.print(sNode.data+" ");
                node = sNode.right;
            }
        }
    }

    /**
     * 后序遍历
     * @param node
     */
    public static void postOrder(TreeNode node){

        Stack<TreeNode> stack = new Stack<>();
        TreeNode visited = null;
        while(node!=null|| !stack.isEmpty()){

            while(node!=null){
                stack.push(node);
                node = node.left;
            }

            if(!stack.isEmpty()){


                TreeNode pop = stack.pop();

                if(pop.right==null||pop.right == visited){
                    System.out.print(pop.data + " ");
                    visited = pop;
                }else{
                    stack.push(pop);
                    node = pop.right;
                }

            }

        }
    }

    /**
     * 层次遍历
     * @param node
     */
    public static void layerOrder(TreeNode node){

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){

            TreeNode pop = queue.pop();
            System.out.print(pop.data + " ");
            if(pop.left!=null){
                queue.add(pop.left);
            }
            if(pop.right!=null){
                queue.add(pop.right);
            }
        }
    }
}
