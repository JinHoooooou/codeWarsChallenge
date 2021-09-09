package codeWars.kyu6.meeting_20200904;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MeetingBestPractice {

  public static String meeting(String s) {
    String result = Arrays.stream(s.toUpperCase().split(";"))
        .map(guest -> guest.replaceAll("(.*):(.*)", "($2, $1)"))
        .sorted()
        .collect(Collectors.joining());
    return result;
  }
}
