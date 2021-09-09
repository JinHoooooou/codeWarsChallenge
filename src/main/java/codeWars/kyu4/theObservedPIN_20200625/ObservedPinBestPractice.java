package codeWars.kyu4.theObservedPIN_20200625;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ObservedPinBestPractice {

  static final Map<Character, String> adjacentMap = new HashMap<Character, String>() {{
    put('1', "124");
    put('2', "1235");
    put('3', "236");
    put('4', "1457");
    put('5', "24568");
    put('6', "3569");
    put('7', "478");
    put('8', "57890");
    put('9', "689");
    put('0', "80");
  }};

  public static List<String> getPINs(String observed) {
    List<String> result = new ArrayList<>();
    result.add("");
    for (char target : observed.toCharArray()) {
      List<String> tempList = new ArrayList<>();
      for (char mapChar : adjacentMap.get(target).toCharArray()) {
        for (String str : result) {
          tempList.add(str + mapChar);
        }
        result = tempList;
      }
    }
    return result;
  }

}
