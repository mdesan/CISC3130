package Study;

public class CodeWithBinaryTrees {

    //calculates the total number of nodes in a binary tree
    public static <E> int size(BinaryTreeNode<E> root){

        if(root==null){
            return 0; //reached the leafs child
        }
        else{
            return 1+ size(root.left) + size(root.right);
        }
    }

    public static int height(BinaryTreeNode<?> root){

        if(root==null){
            return 0;
        }
        else{
            return 1 + size(root.left) + size(root.right);
        }

    }



}
