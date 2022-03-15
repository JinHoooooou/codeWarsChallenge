package codewars._5kyu.Buddy_Pairs_20220315;

public class Bud {

  public static String buddy(long start, long limit) {
    String result = "";
    for (long i = start; i < limit; i++) {
      long n = getSumOfDivisors(i);
      long m = 0;
      if (n < i) {
        continue;
      } else {
        m = getSumOfDivisors(n - 1);
      }
      if (m - 1 == i) {
        return "(" + (m - 1) + " " + (n - 1) + ")";
      }
    }
    return "Nothing";
  }

  private static long getSumOfDivisors(long num) {
    long sum = 0;
    for (long i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        sum += i;
        sum += (num / i);
      }
      if (i * i == num) {
        sum -= i;
      }
    }
    return sum + 1;
  }

  public static String buddyBestPractice(long start, long limit) {
    long A;
    long B;

    for (long i = start; i <= limit; i++) {
      A = i;
      B = divSum(i) - 1;
      if ((A + 1 == divSum(B)) & (B > A)) {
        return ("(" + A + " " + B + ")");
      }
    }

    return "Nothing";
  }

  public static long divSum(long A) {
    long divSum = 0;
    for (long i = 2; i <= Math.sqrt(A); i++) {
      if (A % i == 0) {
        divSum = divSum + i + A / i;
      }
      if (i * i == A) {
        divSum = divSum - i;
      }
    }
    divSum++;
    return divSum;
  }
}
