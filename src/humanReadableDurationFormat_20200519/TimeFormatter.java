package humanReadableDurationFormat_20200519;

public class TimeFormatter {

  public static String formatDuration(int seconds) {
    String result = "";
    int day = seconds / (3600 * 24);
    int hour = seconds % (3600 * 24) / 3600;
    int minute = seconds % 3600 / 60;
    int second = seconds % 60;

    if (second > 0) {
      result = second + (second > 1 ? " seconds" : " second");
    }
    if (minute > 0) {
      if (second > 0) {
        result = " and " + result;
      }
      result = minute + (minute > 1 ? " minutes" : " minute") + result;
    }
    if (hour > 0) {
      if (minute > 0 || second > 0) {
        result = ", " + result;
      }
      result = hour + (hour > 1 ? " hours" : " hour") + result;
    }

    if (day > 0) {
      if (hour > 0 || minute > 0 || second > 0) {
        result = ", " + result;
      }
      result = day + (day > 1 ? " days" : " day") + result;
    }

    return result;
  }
}
