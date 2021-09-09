package codeWars.kyu5.josephusPermutation_20200914;

import java.util.ArrayList;
import java.util.List;

public class Josephus {

  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

    if (items.size() == 0) {
      return new ArrayList<>();
    }
    List<T> itemList = new ArrayList<>(items);
    List<T> result = new ArrayList<>();
    int index = (k % itemList.size());
    while (itemList.size() != 1) {
      index = index == 0 ? itemList.size() : index;
      result.add(itemList.remove(index - 1));
      index = (index + k - 1) % (itemList.size());
    }
    result.add(itemList.remove(0));
    return result;
  }
}
