package codeWars.kyu7.Pandemia_20211015;

import java.util.Arrays;

public class BestPractice {

  public static double infected(String input) {
    int infectedPeople = Arrays.stream(input.split("X"))
        .filter(x -> x.contains("X"))
        .mapToInt(String::length)
        .sum();
    int worldPeople = input.replaceAll("X", "").length();

    return worldPeople == 0 ? 0d : 100.0 * infectedPeople / worldPeople;
  }
}
