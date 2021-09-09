package codeWars.countTheSmileyFaces_20200501;

import java.util.List;

public class SmileFacesBestPractice {

  public static int countSmileys(List<String> arr) {
    return (int) arr.stream().filter(x -> x.matches("^[:;][-~]?[)D]")).count();
  }
}
