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
  
  public boolean contains(AnyType x){
    return contains(x, root);
  }
  
  public AnyType findMin(){
    if(isEmpty()) return UnderflowException();
    return findMin(root).element;
  }
  public AnyType findMax(){
    if(isEmpty()) return UnderflowException();
    return findMax(root).element;
  }
  
  public void insert(AnyType x){
    root = insert(x, root);
  }
  public void remove(AnyType x){
    root = remove(x, root)
  }
  
  public void printTree(){
    
  }
  
  private boolean contains(AnyType x, BinaryNode<AnyType> t){
    
  }
  
  private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t){
    
  }
  
  private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t){
    
  }
  
  private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t){
    
  }
  
  private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t){
    
  }
  
  private void printTree(BinaryNode<AnyType> t){
    
  }
}
