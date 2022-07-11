package datastructures.graph;

import java.util.ArrayList;
// Learning how to implement Graphs

public class GraphAdjList extends Graph{
  @Override
  public void implementAddVertex() {
    int v = getNumVertices();
    ArrayList<Integer> neighbors = new ArrayList<>();
    adjLists.put(v, neighbors);
  }

  public void implementAddEdge(int v, int w){
    (adjLists.get(v)).add(w);
  }

  @Override
  public ArrayList<Integer> getNeighbors(int v) {
    return null;
  }
}
