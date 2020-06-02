package codeWars.substep_20200326;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {

  public static String songDecoder(String song) {

    /*return song.replaceAll("(WUB)+", " ").trim();*/


    String result = Arrays.stream(song.split("WUB")).filter(s -> !s.equals(""))
        .collect(Collectors.joining(" "));



    return result;


   /* String[] splitByWUB = song.split("WUB");
    StringBuilder result = new StringBuilder();
    int count = 0;
    for (int i = 0; i < splitByWUB.length; i++) {
      if (!splitByWUB[i].equals("") && count == 0) {
        result.append(splitByWUB[i]);
        count++;
      } else if (!splitByWUB[i].equals("") && count != 0) {
        result.append(" ").append(splitByWUB[i]);
      }
    }
    return result.toString();
    */
  }
}


