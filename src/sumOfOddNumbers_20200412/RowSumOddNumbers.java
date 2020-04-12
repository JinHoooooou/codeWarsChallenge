package sumOfOddNumbers_20200412;

public class RowSumOddNumbers {

  public static int rowSumOddNumbers(int n) {
    int startIndex = 0;
    int endIndex = 0;
    for (int i = 0; i <= n; i++) {
      endIndex += i;
    }
    startIndex = endIndex - n;
    int[] oddArray = new int[endIndex];
    int odd = 1;
    for (int i = 0; i < endIndex; i++) {
      oddArray[i] = odd;
      odd += 2;
    }
    int sum = 0;
    for (int i = startIndex; i < endIndex; i++) {
      sum += oddArray[i];
    }

    return sum;
  }

}
