package datastructures.graph;

import java.util.LinkedList;

//REFERENCED FROM COURSERA.ORG

// An abstract class is used if you want to provide a common, implemented functionality among all the implementations of the component
public abstract class Graph {

  // You'll want to keep track of how many Vertices and Edges you have throughout your graph. This is why you've created
  // 'int numVertices'
  // 'int numEdges'
 private int numVertices;
 private int numEdges;

// LinkedList<Integer> adjLists[];

  public Graph(){
   numVertices = 0;
   numEdges = 0;
  }
// call the implement add vertex method..
  // Whichever class fills in the specification fills in the implementation will have to tell me how to implement adding a vertex
  // Any graph should be able to do that and as soon as you have implemented addVertex() then numVertices; counter will increment by one
  public void addVertex(){
    implementAddVertex();
    numVertices ++;
  }

  // Adding a vertex method.
  // Each vertex that you have, will have a specific index, so when you add a new vertex -> that new vertex will be added and assigned to the next available index.
  //
  public abstract void implementAddVertex();

  // We care about the relationships between Nodes(Vertices) and if we have a particular node that we want to think about then we want to know
  // which vertices are adjacent to it. If our Nodes are cities... then we would like to know which other cities could we get to just by following a single road(Edge)
  public abstract LinkedList<Integer> getNeighbors(int v);


}
