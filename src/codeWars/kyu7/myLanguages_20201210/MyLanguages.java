package codeWars.kyu7.myLanguages_20201210;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MyLanguages {

  public static List<String> myLanguages(final Map<String, Integer> results) {
    List<String> list = new ArrayList<>();
    List<Entry<String, Integer>> entryList = new ArrayList<>(results.entrySet());
    entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    for (int i = 0; i < entryList.size(); i++) {
      if (entryList.get(i).getValue() >= 60) {
        list.add(entryList.get(i).getKey());
      }
    }
    return list;
  }
}
