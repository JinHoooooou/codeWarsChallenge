package doNotSolve.codewars.kyu3.theMillionthFibonacciKata;

import java.math.BigInteger;

public class Fibonacci {

  public static final BigInteger ZERO = BigInteger.ZERO;
  public static final BigInteger ONE = BigInteger.ONE;
  public static final BigInteger TWO = BigInteger.valueOf(2);

  public static BigInteger fib(BigInteger n) {
    BigInteger result = fibIter(ONE, ZERO, ZERO, ONE, n.abs());
    return (n.signum() < 0) && n.mod(TWO).equals(ZERO) ? result.negate() : result;
  }

  private static BigInteger fibIter(BigInteger a, BigInteger b, BigInteger p, BigInteger q,
      BigInteger n) {
    if (n.equals(ZERO)) {
      return b;
    }
    if (n.mod(TWO).equals(ZERO)) {
      BigInteger pp = p.pow(2).add(q.pow(2));
      BigInteger qq = p.multiply(q.multiply(TWO)).add(q.pow(2));
      BigInteger nn = n.divide(TWO);
      return fibIter(a, b, pp, qq, nn);
    }
    BigInteger aa = b.multiply(q).add(a.multiply(q)).add(a.multiply(p));
    BigInteger bb = b.multiply(p).add(a.multiply(q));
    BigInteger nn = n.subtract(ONE);
    return fibIter(aa, bb, p, q, nn);
  }
}
