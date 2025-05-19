package Study;

public class BinaryTreeNode<E> {

    public E data;
    public BinaryTreeNode<E> left, right;

    public BinaryTreeNode(E data, BinaryTreeNode<E> left, BinaryTreeNode<E> right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public BinaryTreeNode(E data){
        this(data,null,null);
    }
}
