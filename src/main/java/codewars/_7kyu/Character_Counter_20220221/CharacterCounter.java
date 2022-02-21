package codewars._7kyu.Character_Counter_20220221;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {

  public static boolean validateWord(String word) {
    String[] split = word.toLowerCase().split("");

    Map<String, Integer> map = new HashMap<>();
    for (String token : split) {
      map.put(token, map.getOrDefault(token, 0) + 1);
    }

    HashSet<Integer> counts = new HashSet<>(map.values());
    return counts.size() == 1;
  }

  public static boolean validateWordBestPractice(String word) {
    return new HashSet<Long>(word.toLowerCase().chars().boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .values()
    ).size() == 1;
  }
}
