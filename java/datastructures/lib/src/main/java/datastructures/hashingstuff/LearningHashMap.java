package datastructures.hashingstuff;

import java.util.HashMap;

public class LearningHashMap {
    public HashMap<Integer, String> DataStructures() {
      HashMap<Integer, String> dataStructures = new HashMap<>();

      dataStructures.put(1, "LinkedList");
      dataStructures.put(2, "HashMap");
      dataStructures.put(3, "Graphs");
      dataStructures.put(4, "Trees");
      dataStructures.put(5, "Insertion Sort");

      System.out.println("HashMap: " + dataStructures);
      return dataStructures;

      

    }
}

