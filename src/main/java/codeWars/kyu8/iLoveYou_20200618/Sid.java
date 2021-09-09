package codeWars.kyu8.iLoveYou_20200618;

import java.util.HashMap;
import java.util.Map;

public class Sid {

  public static String howMuchILoveYou(int nb_petals) {
    Map<Integer, String> petalMap = new HashMap<>();
    petalMap.put(1, "I love you");
    petalMap.put(2, "a little");
    petalMap.put(3, "a lot");
    petalMap.put(4, "passionately");
    petalMap.put(5, "madly");
    petalMap.put(6, "not at all");

    return petalMap.getOrDefault(nb_petals % 6, null);
  }
}
