package codeWars.kyu7.responsibleDrinking_20210120;

import java.util.Arrays;

public class Drinkin {

  public String hydrate(String drinkString) {
    String[] numbers = drinkString.split("[^\\d]+");
    int sum = Arrays.stream(numbers).map(Integer::parseInt).mapToInt(x -> x).sum();
    return sum == 1 ? "1 glass of water" : String.format("%d glasses of water", sum);
  }
}
