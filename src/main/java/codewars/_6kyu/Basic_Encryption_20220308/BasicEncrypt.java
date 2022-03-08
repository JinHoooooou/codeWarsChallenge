package codewars._6kyu.Basic_Encryption_20220308;

import java.util.stream.Collectors;

public class BasicEncrypt {

  public static String encrypt(String text, int rule) {
    return text.chars()
        .map(x -> ((x + rule) % 256))
        .mapToObj(x -> String.valueOf((char) x))
        .collect(Collectors.joining());
  }
}
