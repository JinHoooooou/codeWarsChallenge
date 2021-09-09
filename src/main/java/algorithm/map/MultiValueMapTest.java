package algorithm.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

public class MultiValueMapTest {

  Map<Character, List<String>> dictionaryMap = new TreeMap<>();

  @Test
  public void multiValueMapTest() {
    addWord("apple");
    addWord("dig");
    addWord("drug");
    addWord("banana");
    addWord("abc-Mart");
    addWord("africa");
    addWord("ace");
    addWord("big");
    addWord("boy");
    addWord("drum");
    addWord("cap");

    printSortedDictionaryMap(dictionaryMap);
  }

  private void printSortedDictionaryMap(Map<Character, List<String>> dictionaryMap) {
    for (Entry<Character, List<String>> entry : dictionaryMap.entrySet()) {
      System.out.println("--- " + entry.getKey() + " ---");

      List<String> words = entry.getValue();
      words.sort(Comparator.naturalOrder());

      for (int i = 0; i < words.size(); i++) {
        System.out.println(i + 1 + ". " + words.get(i));
      }
    }
  }

  private void addWord(String word) {
    List<String> words = dictionaryMap.containsKey(word.charAt(0))
        ? dictionaryMap.get(word.charAt(0))
        : new ArrayList<>();

    words.add(word);
    dictionaryMap.put(word.charAt(0), words);
  }
}
