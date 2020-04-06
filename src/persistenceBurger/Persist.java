package persistenceBurger;


import java.util.stream.IntStream;

public class Persist {

  public static int persistence(long n) {
    long result = n;
    int count = 0;
    while (result > 9) {
      String[] temp = String.valueOf(result).split("");
      result = 1;
      for (int i = 0; i < temp.length; i++) {
        result = result * Long.parseLong(temp[i]);
      }
      count++;
    }

    return count;
  }
}
