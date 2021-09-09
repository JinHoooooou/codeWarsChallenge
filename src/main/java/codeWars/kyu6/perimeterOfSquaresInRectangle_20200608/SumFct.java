package codeWars.kyu6.perimeterOfSquaresInRectangle_20200608;

import java.math.BigInteger;
import java.util.Arrays;

public class SumFct {

  public static BigInteger perimeter(BigInteger n) {

    BigInteger first = BigInteger.valueOf(1);
    BigInteger second = BigInteger.valueOf(1);
    BigInteger third;
    BigInteger sumFct = BigInteger.valueOf(2);
    for (int i = 2; i < n.intValue() + 1; i++) {
      third = first.add(second);
      sumFct = sumFct.add(third);
      first = second;
      second = third;
    }
    return sumFct.multiply(BigInteger.valueOf(4));
  }
}
