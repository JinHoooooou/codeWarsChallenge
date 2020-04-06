package yourOrderPlease_20200330;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

  public static String order(String words) {
    List<String> list = new ArrayList<String>();

    for (int i = 0; i < 10; i++) {
      int finalI = i;
      String temp = Arrays.stream(words.split(" ")).filter(s -> s.contains(String.valueOf(finalI)))
          .collect(Collectors.joining());
      if (!temp.equals("")) {
        list.add(temp);
      }
    }

    return String.join(" ", list).trim();
  }
}
