package codeWars.kyu7.toLeetSpeak_20201023;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Kata {

  static Map<Character, Character> leetAlpahbets;

  static {
    leetAlpahbets = new HashMap<>();
    leetAlpahbets.put('A', '@');
    leetAlpahbets.put('B', '8');
    leetAlpahbets.put('C', '(');
    leetAlpahbets.put('D', 'D');
    leetAlpahbets.put('E', '3');
    leetAlpahbets.put('F', 'F');
    leetAlpahbets.put('G', '6');
    leetAlpahbets.put('H', '#');
    leetAlpahbets.put('I', '!');
    leetAlpahbets.put('J', 'J');
    leetAlpahbets.put('K', 'K');
    leetAlpahbets.put('L', '1');
    leetAlpahbets.put('M', 'M');
    leetAlpahbets.put('N', 'N');
    leetAlpahbets.put('O', '0');
    leetAlpahbets.put('P', 'P');
    leetAlpahbets.put('Q', 'Q');
    leetAlpahbets.put('R', 'R');
    leetAlpahbets.put('S', '$');
    leetAlpahbets.put('T', '7');
    leetAlpahbets.put('U', 'U');
    leetAlpahbets.put('V', 'V');
    leetAlpahbets.put('W', 'W');
    leetAlpahbets.put('X', 'X');
    leetAlpahbets.put('Y', 'Y');
    leetAlpahbets.put('Z', '2');
  }

  public static String toLeetSpeak(final String speak) {
    return speak.toUpperCase().chars().map(x -> leetAlpahbets.getOrDefault((char) x, (char) x))
        .mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
  }
}
