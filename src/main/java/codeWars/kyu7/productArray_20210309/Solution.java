package codeWars.kyu7.productArray_20210309;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static long[] productArray(int[] numbers) {
    List<Long> result = new ArrayList<>();
    BigInteger product = BigInteger.ONE;
    for (int i = 0; i < numbers.length; i++) {
      product = product.multiply(BigInteger.valueOf(numbers[i]));
    }

    for (int i = 0; i < numbers.length; i++) {
      result.add(product.divide(BigInteger.valueOf(numbers[i])).longValue());
    }
    return result.stream().mapToLong(x -> x).toArray();
  }
}
