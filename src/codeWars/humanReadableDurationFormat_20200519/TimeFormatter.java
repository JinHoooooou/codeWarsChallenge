package codeWars.humanReadableDurationFormat_20200519;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

  private static int SECOND_PER_MINUTE = 60;
  private static int SECOND_PER_HOUR = 60 * SECOND_PER_MINUTE;
  private static int SECOND_PER_DAY = 24 * SECOND_PER_HOUR;
  private static int SECOND_PER_YEAR = 365 * SECOND_PER_DAY;

  public static String formatDuration(int seconds) {
    if (seconds == 0) {
      return "now";
    }
    int year = seconds / SECOND_PER_YEAR;
    seconds = seconds % SECOND_PER_YEAR;
    int day = seconds / SECOND_PER_DAY;
    seconds = seconds % SECOND_PER_DAY;
    int hour = seconds / SECOND_PER_HOUR;
    seconds = seconds % SECOND_PER_HOUR;
    int minute = seconds / SECOND_PER_MINUTE;
    int second = seconds % SECOND_PER_MINUTE;

    List<String> format = new ArrayList<>();
    if (year > 0) {
      format.add(year + (year > 1 ? " years" : " year"));
    }
    if (day > 0) {
      format.add(day + (day > 1 ? " days" : " day"));
    }
    if (hour > 0) {
      format.add(hour + (hour > 1 ? " hours" : " hour"));
    }
    if (minute > 0) {
      format.add(minute + (minute > 1 ? " minutes" : " minute"));
    }
    if (second > 0) {
      format.add(second + (second > 1 ? " seconds" : " second"));
    }
    return makeStringFormat(format);
  }

  private static String makeStringFormat(List<String> format) {
    String result = "";
    if (format.size() > 1) {
      result = String.join(", ", format);
      String frontComponent = result.substring(0, result.lastIndexOf(","));
      String lastComponent = result.substring(result.lastIndexOf(",") + 1);
      result = frontComponent + " and" + lastComponent;
    } else {
      result = String.join("", format);
    }
    return result;
  }
}
