package codeWars.kyu6.newCashierDoseNotKnowAboutSpaceOrShift_20201204;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static String getOrder(String input) {
    Map<String, Integer> menu = getMenu(input);
    return getCleanOrder(menu);
  }

  private static String getCleanOrder(Map<String, Integer> menu) {
    StringBuilder order = new StringBuilder();
    for (int i = 0; i < menu.getOrDefault("Burger", 0); i++) {
      order.append("Burger ");
    }
    for (int i = 0; i < menu.getOrDefault("Fries", 0); i++) {
      order.append("Fries ");
    }
    for (int i = 0; i < menu.getOrDefault("Chicken", 0); i++) {
      order.append("Chicken ");
    }
    for (int i = 0; i < menu.getOrDefault("Pizza", 0); i++) {
      order.append("Pizza ");
    }
    for (int i = 0; i < menu.getOrDefault("Sandwich", 0); i++) {
      order.append("Sandwich ");
    }
    for (int i = 0; i < menu.getOrDefault("Onionrings", 0); i++) {
      order.append("Onionrings ");
    }
    for (int i = 0; i < menu.getOrDefault("Milkshake", 0); i++) {
      order.append("Milkshake ");
    }
    for (int i = 0; i < menu.getOrDefault("Coke", 0); i++) {
      order.append("Coke ");
    }
    return order.toString().trim();
  }

  private static Map<String, Integer> getMenu(String input) {
    Map<String, Integer> menu = new HashMap<>();
    while (!input.isEmpty()) {
      if (input.charAt(0) == 'b' && input.substring(0, 6).equals("burger")) {
        menu.put("Burger", menu.getOrDefault("Burger", 0) + 1);
        input = input.substring(6);
      } else if (input.charAt(0) == 'f' && input.substring(0, 5).equals("fries")) {
        menu.put("Fries", menu.getOrDefault("Fries", 0) + 1);
        input = input.substring(5);
      } else if (input.charAt(0) == 'p' && input.substring(0, 5).equals("pizza")) {
        menu.put("Pizza", menu.getOrDefault("Pizza", 0) + 1);
        input = input.substring(5);
      } else if (input.charAt(0) == 's' && input.substring(0, 8).equals("sandwich")) {
        menu.put("Sandwich", menu.getOrDefault("Sandwich", 0) + 1);
        input = input.substring(8);
      } else if (input.charAt(0) == 'o' && input.substring(0, 10).equals("onionrings")) {
        menu.put("Onionrings", menu.getOrDefault("Onionrings", 0) + 1);
        input = input.substring(10);
      } else if (input.charAt(0) == 'm' && input.substring(0, 9).equals("milkshake")) {
        menu.put("Milkshake", menu.getOrDefault("Milkshake", 0) + 1);
        input = input.substring(9);
      } else if (input.charAt(0) == 'c') {
        if (input.substring(0, 4).equals("coke")) {
          menu.put("Coke", menu.getOrDefault("Coke", 0) + 1);
          input = input.substring(4);
        } else if (input.substring(0, 7).equals("chicken")) {
          menu.put("Chicken", menu.getOrDefault("Chicken", 0) + 1);
          input = input.substring(7);
        }
      }
    }
    return menu;
  }
}
