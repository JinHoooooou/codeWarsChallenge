package algorithm.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

public class MapSortTest {

  Map<Integer, String> numberCountryMap;

  MapSortTest() {
    numberCountryMap = new HashMap<>();
    numberCountryMap.put(82, "대한민국");
    numberCountryMap.put(1, "미국");
    numberCountryMap.put(33, "프랑스");
    numberCountryMap.put(7, "러시아");
    numberCountryMap.put(61, "호주");
    numberCountryMap.put(84, "베트남");
    numberCountryMap.put(81, "일본");
    numberCountryMap.put(886, "대만");
    numberCountryMap.put(44, "영국");
    System.out.println("----base map----");
    printMap(numberCountryMap);
  }

  private void printMap(Map<Integer, String> map) {
    for (Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("Key : " + entry.getKey() + " / Value : " + entry.getValue());
    }
    System.out.println();

  }

  @Test
  public void mapEntireSortByAscendingKeyTest() {
    Map<Integer, String> keyAscendingMap = new TreeMap<>(Comparator.naturalOrder());
    keyAscendingMap.putAll(numberCountryMap);
    System.out.println("---key ascending map ---");
    printMap(keyAscendingMap);
  }

  @Test
  public void mapEntireSortByDescendingKeyTest() {
    Map<Integer, String> keyDescendingMap = new TreeMap<>(Comparator.reverseOrder());
    keyDescendingMap.putAll(numberCountryMap);
    System.out.println("---key descending map---");
    printMap(keyDescendingMap);
  }

  @Test
  public void mapEntireSortByAscendingValueTest() {
    List<Entry<Integer, String>> entryList = new ArrayList<>(numberCountryMap.entrySet());
    entryList.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
    // entryList.sort(Comparator.comparing(Entry::getValue));
    // entryList.sort(Entry.comparingByValue());

    Map<Integer, String> valueAscendingMap = new LinkedHashMap<>();
    for (Entry<Integer, String> entry : entryList) {
      valueAscendingMap.put(entry.getKey(), entry.getValue());
    }

    System.out.println("--- value ascending map ---");
    printMap(valueAscendingMap);
  }

  @Test
  public void mapEntireSortByDescendingValueTest() {
    List<Entry<Integer, String>> entryList = new ArrayList<>(numberCountryMap.entrySet());
    entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

    Map<Integer, String> valueDescendingMap = new LinkedHashMap<>();
    for (Entry<Integer, String> entry : entryList) {
      valueDescendingMap.put(entry.getKey(), entry.getValue());
    }
    System.out.println("--- value descending map ---");
    printMap(valueDescendingMap);
  }

  @Test
  public void keyListTest() {
    List<Integer> keys = new ArrayList<>(numberCountryMap.keySet());
    for (Integer key : keys) {
      System.out.println("Key : " + key);
    }
    System.out.println();
  }

  @Test
  public void valueListTest() {
    List<String> values = new ArrayList<>(numberCountryMap.values());
    for (String value : values) {
      System.out.println("Value : " + value);
    }
    System.out.println();
  }
}
