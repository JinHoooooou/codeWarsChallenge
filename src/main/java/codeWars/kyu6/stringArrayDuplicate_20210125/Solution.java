package codeWars.kyu6.stringArrayDuplicate_20210125;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static String[] dup(String[] arr) {
    String[] result = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      List<String> distinct = new ArrayList<>(Arrays.asList(arr[i].split("")));
      for (int j = 0; j < distinct.size() - 1; j++) {
        if (distinct.get(j).equals(distinct.get(j + 1))) {
          distinct.remove(j);
          j--;
        }
      }
      result[i] = String.join("", distinct);
    }

    return result;
  }
}
