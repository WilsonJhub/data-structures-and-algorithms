package datastructures.trees;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
  public ArrayList<Integer> tNodeArrayList;
  public List<Integer> levels = new ArrayList<>();

  public List<Integer> fbList = new ArrayList<>();
  public Node<Integer> tNode;

  public BinaryTree(){
    tNode = new Node<>();
    tNodeArrayList = new ArrayList<>();
  }

  //In preOrder traversal, you visit the root Node first, then the left subTree, and then push Data to array.
  // Data->Left->Right
  public void traversePreOrder(Node<Integer> tNode) {
    if (tNode != null) {
      tNodeArrayList.add(tNode.value);
      traversePreOrder(tNode.left);
      traversePreOrder(tNode.right);
    }
  }

    // In inOrder traversal, you visit the left subTree, then the root Node, and then push Data to array.
    // Left->Data->Right
    public void traverseInOrder(Node<Integer> tNode){
      if(tNode != null){
        traverseInOrder(tNode.left);
        tNodeArrayList.add(tNode.value);
        traverseInOrder(tNode.right);

      }
    }

    // In postOrder traversal, you visit the left subTree, then the right subTree, and then push Data to array.
    // Left->Right->Data
  public void traversePostOrder(Node<Integer> tNode){
    if(tNode != null){
      traverseInOrder(tNode.left);
      traverseInOrder(tNode.right);
      tNodeArrayList.add(tNode.value);

    }
  }

  public int maxValOfTree(){

    int num = 0;
    for(int i = 0; i < tNodeArrayList.size(); i++){
      if(num < tNodeArrayList.get(i)){
        num = tNodeArrayList.get(i);
      }
    }
    return num;
  }


  public void helper(Node<Integer> node, int level) {

//    if (levels.size() == level)
//      levels.add(node.value);
        levels.add(node.value);
    if (node.left != null)
      helper(node.left, level + 1);
    if (node.right != null)
      helper(node.right, level + 1);
  }    public List<Integer> levelOrder(Node<Integer> root) {
    if (root == null) return levels;
    helper(root, 0);
    return levels;
  }

//  public fizzBuzzTree(k-ary tree)

  }



