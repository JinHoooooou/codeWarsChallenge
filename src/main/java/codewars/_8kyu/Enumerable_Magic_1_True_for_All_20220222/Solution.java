package codewars._8kyu.Enumerable_Magic_1_True_for_All_20220222;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Solution {

  public static boolean all(int[] list, IntPredicate predicate) {
    return Arrays.stream(list).allMatch(predicate);
  }
}
