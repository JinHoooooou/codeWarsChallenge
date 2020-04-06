package descendingOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DescendingOrder {

  public static int sortDesc(final int num) {
    String parseToString = String.valueOf(num);
    String result = "";

    List<Integer> digitList = makeDigitList(parseToString);
    digitList.sort(Comparator.reverseOrder());
    result = makeDescendingOrderString(digitList);

    return Integer.parseInt(result);
  }

  private static String makeDescendingOrderString(List<Integer> digitList) {
    StringBuilder result = new StringBuilder();
    for (Integer integer : digitList) {
      result.append(integer);
    }
    return result.toString();
  }

  private static List<Integer> makeDigitList(String parseToString) {
    List<Integer> digitList = new ArrayList<>();
    for (int i = 0; i < parseToString.length(); i++) {
      digitList.add(Integer.parseInt(String.valueOf(parseToString.charAt(i))));
    }
    return digitList;
  }

}
