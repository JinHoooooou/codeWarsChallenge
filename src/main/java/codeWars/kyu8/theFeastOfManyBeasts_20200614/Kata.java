package codeWars.kyu8.theFeastOfManyBeasts_20200614;

public class Kata {

  public static boolean feast(String beast, String dish) {
    beast = beast.charAt(0) + beast.substring(beast.length() - 1);
    dish = dish.charAt(0) + dish.substring(dish.length() - 1);
    return beast.equals(dish);
  }
}
