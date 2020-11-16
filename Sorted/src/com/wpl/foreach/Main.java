package com.wpl.foreach;

import java.util.LinkedList;

/**
 * @author 汪培林
 * @data 2020-11-16  14:17:39
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{9,4,8,1,3,6,7,0,0,2,0,0,5};
        /*LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i<array.length;i++){
            list.add(array[i]);
        }*/
        TreeNode node = TreeNodeForeach.createBinaryTree(array);
        TreeNodeForeach.preOrder(node);
        System.out.println();
        TreeNodeForeach.midOrder(node);
        System.out.println();
        TreeNodeForeach.postOrder(node);
        System.out.println();
        TreeNodeForeach.layerOrder(node);
    }
}
