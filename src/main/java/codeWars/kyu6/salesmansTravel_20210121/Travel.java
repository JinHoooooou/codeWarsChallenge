package codeWars.kyu6.salesmansTravel_20210121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Travel {

  public static String travel(String r, String zipcode) {
    System.out.println(r);
    System.out.println(zipcode);
    System.out.println();
    if (zipcode.isEmpty()) {
      return ":/";
    }

    String[] addresses = r.split(",");
    List<String> houseNumbers = new ArrayList<>();
    List<String> travelAddresses = new ArrayList<>();

    for (String address : addresses) {
      List<String> split = new ArrayList<>(Arrays.asList(address.split(" ")));
      String code = getCode(split);
      if (zipcode.equals(code)) {
        houseNumbers.add(split.remove(0));
        travelAddresses.add(String.join(" ", split).trim());
      }
    }

    String address = String.join(",", travelAddresses);
    String numbers = String.join(",", houseNumbers);

    return String.format("%s:%s/%s", zipcode, address, numbers);
  }

  private static String getCode(List<String> split) {
    return split.remove(split.size() - 2) + " " + split.remove(split.size() - 1);
  }
}
