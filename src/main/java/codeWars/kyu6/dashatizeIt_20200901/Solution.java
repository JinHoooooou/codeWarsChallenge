package codeWars.kyu6.dashatizeIt_20200901;

import java.util.ArrayList;

public class Solution {

  public static String dashatize(int num) {
    System.out.println(num);
    String[] split = String.valueOf(num).replace("-", "").split("");
    String result = "";
    for (String number : split) {
      if (Integer.parseInt(number) % 2 == 1) {
        result += "-" + number + "-";
      } else {
        result += number;
      }
    }

    String[] temp = result.split("-");
    ArrayList<String> realResult = new ArrayList<>();

    for (int i = 0; i < temp.length; i++) {
      if (!temp[i].equals("")) {
        realResult.add(temp[i]);
      }
    }

    return String.join("-", realResult);
  }
}
