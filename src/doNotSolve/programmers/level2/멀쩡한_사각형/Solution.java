package doNotSolve.programmers.level2.멀쩡한_사각형;

public class Solution {

  public long solution(int width, int height) {
    long gcd = gcd((long) width, (long) height);
    long gcdWidth = (long) width / gcd;
    long gcdHeight = (long) height / gcd;

    long tornSquareCount = (gcdWidth + gcdHeight - 1) * gcd;

    return ((long) width * (long) height - tornSquareCount);
  }

  private long gcd(long width, long height) {
    if (height == 0) {
      return width;
    }
    return gcd(height, width % height);
  }
}
