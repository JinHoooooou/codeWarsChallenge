package codewars._7kyu.Changing_letters_20220321;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

  public static String swap(String st) {
    return Arrays.stream(st.split(""))
        .map(x -> x.matches("[aeiout]") ? x.toUpperCase() : x)
        .collect(Collectors.joining(""));
  }
}
