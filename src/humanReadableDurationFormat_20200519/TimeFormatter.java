package humanReadableDurationFormat_20200519;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

  public static String formatDuration(int seconds) {
    if (seconds == 0) {
      return "now";
    }
    String result = "";
    List<String> format = new ArrayList<>();
    int year = seconds / (3600 * 24 * 365);
    int day = seconds % (3600 * 24 * 365) / (3600 * 24);
    int hour = seconds % (3600 * 24) / 3600;
    int minute = seconds % 3600 / 60;
    int second = seconds % 60;

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
