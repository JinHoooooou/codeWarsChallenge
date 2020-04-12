package equalSidesOfAnArray_20200411;

import java.util.Arrays;

public class Kata {

  public static int findEvenIndex(int[] arr) {
    for (int targetIndex = 0; targetIndex < arr.length; targetIndex++) {
      if (leftSum(arr, targetIndex) == rightSum(arr, targetIndex)) {
        return targetIndex;
      }
    }
    return -1;
  }

  private static int rightSum(int[] arr, int targetIndex) {
    int sum = 0;
    for (int i = arr.length - 1; i > targetIndex; i--) {
      sum += arr[i];
    }
    return sum;
  }

  private static int leftSum(int[] arr, int targetIndex) {
    int sum = 0;
    for (int i = 0; i < targetIndex; i++) {
      sum += arr[i];
    }
    return sum;
  }

//  public class Kata {
//    public static int findEvenIndex(int[] arr) {
//      int sumRight = Arrays.stream(arr).sum() - arr[0];
//      int sumLeft = 0;
//      if(sumRight == sumLeft) {
//        return 0;
//      }
//      for (int i = 1; i < arr.length; i++) {
//        sumLeft += arr[i-1];
//        sumRight -= arr[i];
//        if (sumLeft == sumRight) return i;
//      }
//      return -1;
//    }
//  }
}
