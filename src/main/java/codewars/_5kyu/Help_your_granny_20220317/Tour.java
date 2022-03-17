package codewars._5kyu.Help_your_granny_20220317;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tour {

  public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
    List<String[]> ftowns = buildVisitTowns(arrFriends, ftwns);

    double result = h.getOrDefault(ftowns.get(0)[1], 0.0);
    for (int i = 0; i < ftowns.size() - 1; i++) {
      double distance1 = h.getOrDefault(ftowns.get(i)[1], 0.0);
      double distance2 = h.getOrDefault(ftowns.get(i + 1)[1], 0.0);
      if (distance1 > distance2) {
        continue;
      }
      result += getPythagorean(distance1, distance2);
    }
    result += h.getOrDefault(ftowns.get(ftowns.size() - 1)[1], 0.0);

    return (int) Math.floor(result);
  }

  private static List<String[]> buildVisitTowns(String[] arrFriends, String[][] ftwns) {
    List<String[]> ftowns = new ArrayList<>();
    for (int i = 0; i < arrFriends.length; i++) {
      for (int j = 0; j < ftwns.length; j++) {
        if (ftwns[j][0].equals(arrFriends[i])) {
          ftowns.add(ftwns[j]);
        }
      }
    }
    return ftowns;
  }

  private static double getPythagorean(double distance1, double distance2) {
    return Math.sqrt((distance2 * distance2) - (distance1 * distance1));
  }
}
