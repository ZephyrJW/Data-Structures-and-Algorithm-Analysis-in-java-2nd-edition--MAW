//tree is a set of N nodes and N-1 edge

//REALIZATION:
class TreeNode{
  Object element;
  TreeNode firstChild;
  TreeNode nextSibling;
}

//Binary Tree, every node has less than two children.

//REALIZATION:
class BinaryNode{
  Object element;
  BinaryNode left;
  BinaryNode right;
}

//Binary Search Tree, for every node in BST, value of node X is bigger than left and smaller than right

//node:
private static class BinaryNode<AnyType>{
    //Constructors
  BinaryNode( AnyType theElement ){
    this(theElement, null, null);
  }
  
  BinaryNode( AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<Anytype> rt){
    element = theElement;
    left = lt;
    right = rt;
  }
  
  AnyType element;
  BinaryNode<AnyType> left;
  BinaryNode<AnyType> right;
}
