package codewars._7kyu.List_Filtering_20220117;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {

  public static List filterList(final List list) {

    List<Integer> filteredList = (List<Integer>) list.stream().filter(x -> x instanceof Integer)
        .collect(Collectors.toList());


    return filteredList;
  }
}
