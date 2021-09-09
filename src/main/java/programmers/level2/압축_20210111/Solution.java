package programmers.level2.압축_20210111;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public int[] solution(String msg) {
    Map<String, Integer> dictionary = buildBasicDictionary();
    List<Integer> indexList = new ArrayList<>();
    int letterIndex = 27;
    int startIndex = 0;

    while (startIndex < msg.length()) {
      int endIndex = getEndIndex(msg, dictionary, startIndex);
      String target = msg.substring(startIndex, endIndex);

      indexList.add(dictionary.get(target));
      if (endIndex < msg.length()) {
        dictionary.put(msg.substring(startIndex, endIndex + 1), letterIndex++);
      }

      startIndex = endIndex;
    }

    return indexList.stream().mapToInt(x -> x).toArray();
  }

  private int getEndIndex(String msg, Map<String, Integer> dictionary, int startIndex) {
    int index;
    for (index = startIndex + 1; index <= msg.length(); index++) {
      if (!dictionary.containsKey(msg.substring(startIndex, index))) {
        break;
      }
    }
    return index - 1;
  }

  private Map<String, Integer> buildBasicDictionary() {
    Map<String, Integer> map = new HashMap<>();
    int index = 1;
    for (char letter = 'A'; letter <= 'Z'; letter++, index++) {
      map.put(letter + "", index);
    }
    return map;
  }
}

