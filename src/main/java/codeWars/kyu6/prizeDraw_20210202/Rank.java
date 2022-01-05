package codeWars.kyu6.prizeDraw_20210202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Rank {

  static final String NO_PARTICIPANTS = "No participants";
  static final String NOT_ENOUGH = "Not enough participants";

  public static String nthRank(String st, Integer[] weights, int n) {
    if (st.isEmpty()) {
      return NO_PARTICIPANTS;
    }
    String[] names = st.split(",");
    if (names.length < n) {
      return NOT_ENOUGH;
    }

    Map<String, Integer> ranks = new HashMap<>();

    for (int i = 0; i < names.length; i++) {
      String name = names[i].toLowerCase();
      int rank = name.length();
      for (int j = 0; j < name.length(); j++) {
        rank += (name.charAt(j) - 96);
      }
      ranks.put(names[i], rank * weights[i]);
    }

    List<Entry<String, Integer>> list = new ArrayList<>(ranks.entrySet());
    list.sort((o1, o2) -> {
      int compare = o2.getValue().compareTo(o1.getValue());
      return compare != 0 ? compare : o1.getKey().compareTo(o2.getKey());
    });

    return list.get(n - 1).getKey();
  }
}
