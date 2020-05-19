package humanReadableDurationFormat_20200519;

public class TimeFormatter {

  public static String formatDuration(int seconds) {
    String result = "";
    int second = seconds % 60;
    int minute = seconds / 60;
    if (second > 0) {
      result = second + (second > 1 ? " seconds" : " second");
    }
    if (minute > 0) {
      if (second > 0) {
        result = " and " + result;
      }
      result = minute + (minute > 1 ? " minutes" : " minute") + result;
    }

    return result;
  }
}
