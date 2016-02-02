//Architecture
public class BinarySearchTree<AnyType> extends Comparable<super AnyType>{
  
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
  
  private BinaryNode<AnyType> root;
  
  public BinarySearchTree(){
    root = null;
  }
  
  public void makeEmpty(){
    root = null;
  }
  public boolean isEmpty(){
    return root == null;
  }
  
  public bollean contains(AnyType x){
    return contains(x, root);
  }
}
