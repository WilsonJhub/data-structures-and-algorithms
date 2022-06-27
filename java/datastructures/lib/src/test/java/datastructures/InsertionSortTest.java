package datastructures;


import datastructures.insertionsort.InsertionSort;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

  @Test
  void testingSortMethod(){
    int[] arr = {8, 4, 23, 42, 16, 15};
    InsertionSort sut = new InsertionSort();
    sut.sort(arr);
  }
}


