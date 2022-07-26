package datastructures.uniquecharacters;
import java.util.*;

//public class FindUniqueChar {
//  // Convert the string to character array for sorting
//
//  boolean uniqueChar(String str){
//    char[] chArr = str.toCharArray();
//
//    // using sorting
//    // Arrays.sort() uses binarySort in the background
//    //for non-primitives which is of 0(nlogn) time complexity
//    Arrays.sort(chArr);
//
//    for (int i = 0; i < chArr.length -1; i++){
//      // if the adjacent elements are not
//      // equal, move to the next element
//      if (chArr[i] != chArr[i+1])
//        continue;
//
//      //if at any time, 2 adjacent elements become equal, return false
//      else
//        return false;
//    }
//    return true;
//  }
//}

public class FindUniqueChar{
  // Convert the string to character array for sorting
  boolean uniqueChar(String str) {
    char[] chArray = str.toCharArray();


    // Using sorting
    // Arrays.sort() uses binarySort in the background for non-primitives which is of 0(nlogn) time complexity
    Arrays.sort(chArray);

    for (int i = 0; i < chArray.length - 1; i++) {
      // if adjacent elements are not equal, move to the next element
      if (chArray[i] != chArray[i + 1])
        continue;
        // if at anytime, 2 adjacent elements become equal, return false
      else
        return false;
    }
    return true;
  }
//    char data[] = {'a', 'b', 'c'};
//    String str = new String(data);
}
