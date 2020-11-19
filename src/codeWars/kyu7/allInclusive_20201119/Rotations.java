package codeWars.kyu7.allInclusive_20201119;

import java.util.List;

public class Rotations {

  public static boolean containAllRots(String strng, List<String> arr) {
    String rotation = strng;

    for (int i = 0; i < strng.length(); i++) {
      if (!arr.contains(rotation)) {
        return false;
      }
      rotation = rotation.substring(1) + rotation.charAt(0);
    }
    return true;
  }
}
