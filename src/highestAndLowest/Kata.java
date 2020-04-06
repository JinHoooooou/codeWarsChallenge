package highestAndLowest;

import java.util.Arrays;

public class Kata {

  public static String highAndLow(String numbers) {

    String[] numberList = numbers.split(" ");
    int highestNumber = Integer.parseInt(numberList[0]);
    int lowestNumber = Integer.parseInt(numberList[0]);

    for (String target : numberList) {
      int parsingToInteger = Integer.parseInt(target);
      if (parsingToInteger > highestNumber) {
        highestNumber = parsingToInteger;
      }
      if (parsingToInteger < lowestNumber) {
        lowestNumber = parsingToInteger;
      }
    }
    return highestNumber + " " + lowestNumber;


    /* Best Practice
    int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
    int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
    return String.format("%d %d", max,min);
     */
  }
}
