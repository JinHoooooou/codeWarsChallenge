package programmers.level2.피보나치수_20201029;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public int solution(int n) {
    BigInteger lastLast = BigInteger.ZERO;
    BigInteger last = BigInteger.ONE;
    BigInteger fib = BigInteger.ZERO;
    for (int i = 2; i <= n; i++) {
      fib = last.add(lastLast);
      lastLast = last;
      last = fib;
    }
    return fib.mod(BigInteger.valueOf(1234567)).intValue();
  }
}
