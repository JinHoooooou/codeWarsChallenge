package doNotSolve.codewars.kyu3.railFenceCipherEncodingAndDecoding;

public class RailFenceCipher {

  public static String encode(String s, int n) {
    int difference = 2 * n - 2;
    int resultsIndex = 0;
    char[] results = new char[s.length()];

    for (int i = 0; i < n; i++) {
      int next = (i == n - 1 ? difference : difference - i * 2);
      int inputIndex = i;
      while (inputIndex < s.length()) {
        results[resultsIndex++] = s.charAt(inputIndex);
        inputIndex += next;
        next = (next == difference ? difference : difference - next);
      }
    }

    return String.valueOf(results);
  }

  public static String decode(String s, int n) {
    int difference = 2 * n - 2;
    int inputIndex = 0;
    char[] results = new char[s.length()];

    for (int i = 0; i < n; i++) {
      int next = (i == n - 1 ? difference : difference - i * 2);
      int resultIndex = i;
      while (resultIndex < s.length()) {
        results[resultIndex] = s.charAt(inputIndex++);
        resultIndex += next;
        next = (next == difference ? difference : difference - next);
      }
    }

    return String.valueOf(results);
  }
}
