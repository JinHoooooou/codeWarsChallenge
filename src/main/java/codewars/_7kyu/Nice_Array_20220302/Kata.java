package codewars._7kyu.Nice_Array_20220302;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata {

  public static boolean isNice(Integer[] arr) {
    if (arr.length == 0) {
      return false;
    }
    for (int i = 0; i < arr.length; i++) {
      int target = arr[i];
      boolean flag = false;
      for (int j = 0; j < arr.length; j++) {
        if (i == j) {
          continue;
        }
        if (target == arr[j] + 1 || target == arr[j] - 1) {
          flag = true;
        }
      }
      if (!flag) {
        return false;
      }
    }
    return true;
  }

  public static boolean isNiceBestPractice(Integer[] arr) {
    Set<Integer> set = new HashSet<>(Arrays.asList(arr));
    for (int target : set) {
      if (!set.contains(target - 1) && !set.contains(target + 1)) {
        return false;
      }
    }
    return !set.isEmpty();
  }

  public static boolean isNiceBestPractice2(Integer[] arr) {
    return Arrays.stream(arr)
        .filter(i -> Arrays.asList(arr).contains(i + 1) || Arrays.asList(arr).contains(i - 1))
        .count() == arr.length && arr.length > 1;
  }
}
