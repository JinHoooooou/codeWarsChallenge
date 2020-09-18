package codeWars.kyu5.int32ToIPv4_20200918;

public class Kata {

  public static String longToIP(long ip) {
    return getIP(getBinary(ip));
  }

  private static String getIP(String binary) {
    String[] result = new String[4];
    for (int i = 0; i < 4; i++) {
      result[i] = String.valueOf(Integer.parseInt(binary.substring(i * 8, (i * 8) + 8), 2));
    }
    return String.join(".", result);
  }

  private static String getBinary(long ip) {
    String binary = Integer.toBinaryString((int) ip);
    while (binary.length() != 32) {
      binary = "0" + binary;
    }
    return binary;
  }
}
