package codeWars.kyu6.Loose_Changes_20211004;

import java.util.HashMap;

public class Change {

  private static int QUARTER = 25;
  private static int DIME = 10;
  private static int NICKEL = 5;

  public static HashMap<String, Integer> looseChange(int cent) {
    int leftCent = Math.max(0, cent);
    HashMap<String, Integer> map = new HashMap<>();

    int quarterCount = leftCent / QUARTER;
    leftCent %= QUARTER;

    int dimeCount = leftCent / DIME;
    leftCent %= DIME;

    int nickelCount = leftCent / NICKEL;
    leftCent %= NICKEL;

    map.put("Quarters", quarterCount);
    map.put("Dimes", dimeCount);
    map.put("Nickels", nickelCount);
    map.put("Pennies", leftCent);

    return map;
  }
}
