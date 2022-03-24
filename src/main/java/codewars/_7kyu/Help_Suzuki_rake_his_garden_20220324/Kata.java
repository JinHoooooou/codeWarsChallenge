package codewars._7kyu.Help_Suzuki_rake_his_garden_20220324;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

  public static String rakeGarden(String garden) {
    return Arrays.stream(garden.split(" "))
        .map(x -> !x.equals("gravel") && !x.equals("rock") ? "gravel" : x)
        .collect(Collectors.joining(" "));
  }
}
