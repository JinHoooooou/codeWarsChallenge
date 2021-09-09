package codeWars.kyu7.myLanguages_20201210;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BestPractice {

  public static List<String> myLanguages(final Map<String, Integer> results) {
    return results.entrySet()
        .stream()
        .filter(x -> x.getValue() >= 60)
        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
        .map(x -> x.getKey())
        .collect(Collectors.toList());
  }
}
