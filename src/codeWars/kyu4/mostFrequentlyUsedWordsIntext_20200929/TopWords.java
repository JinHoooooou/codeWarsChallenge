package codeWars.kyu4.mostFrequentlyUsedWordsIntext_20200929;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopWords {

  public static List<String> top3(String s) {
    String input = s.replaceAll("[/,.;:?!\\-_\n]", " ").toLowerCase().trim();
    Map<String, Integer> wordsCountMap = buildWordsCountMap(input);

    return getMostFrequentlyTop3UsedWordsList(wordsCountMap);
  }

  private static List<String> getMostFrequentlyTop3UsedWordsList(
      Map<String, Integer> wordsCountMap) {
    List<Entry<String, Integer>> list = new ArrayList<>(wordsCountMap.entrySet());
    list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
    List<String> result = new ArrayList<>();
    while (result.size() < 3 && !list.isEmpty()) {
      result.add(list.remove(0).getKey());
    }
    return result;
  }

  private static Map<String, Integer> buildWordsCountMap(String s) {
    String[] words = s.split(" +");
    Map<String, Integer> wordsCountMap = new HashMap<>();
    for (String word : words) {
      if (word.matches("'+")) {
        continue;
      }
      wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
    }
    wordsCountMap.remove("");
    return wordsCountMap;
  }

}
