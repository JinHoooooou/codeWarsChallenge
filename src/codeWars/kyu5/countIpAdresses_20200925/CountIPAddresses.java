package codeWars.kyu5.countIpAdresses_20200925;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountIPAddresses {

  public static long ipsBetween(String start, String end) {
    long[] startIp = Stream.of(start.split("\\.")).mapToLong(Long::parseLong).toArray();
    long[] endIp = Stream.of(end.split("\\.")).mapToLong(Long::parseLong).toArray();

    for (int i = 0; i < 4; i++) {
      startIp[i] *= Math.pow(2, 24 - (8 * i));
      endIp[i] *= Math.pow(2, 24 - (8 * i));
    }
    long difference = Arrays.stream(startIp).sum() - Arrays.stream(endIp).sum();

    return Math.abs(difference);
  }
}
