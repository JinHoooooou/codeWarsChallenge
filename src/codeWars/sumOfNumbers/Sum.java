package codeWars.sumOfNumbers;

public class Sum {

  public static int getSum(int a, int b) {
    if (a == b) {
      return a;
    }
    int start = 0;
    int end = 0;
    int sum = 0;
    if (a < b) {
      start = a;
      end = b;
    } else {
      start = b;
      end = a;
    }

    for (int i = start; i <= end; i++) {
      sum += i;
    }

    return sum;
  }
}


//return ((a + b) * (Math.abs(a - b) - 1)) / 2;
//return IntStream.range(Math.min(a,b), Math.max(a,b) + 1).sum();
    /*int sum = 0;
    for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
      sum += i;
    }
    return sum;
    */