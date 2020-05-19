package humanReadableDurationFormat_20200519;

public class TimeFormatter {

  public static String formatDuration(int seconds) {
    String result = "";
    int second = seconds % 60;
    int minute = seconds / 60;
    if (minute > 0) {
      result = minute + (minute > 1 ? " minutes and " : " minute and ");
    }
    result += second + (second > 1 ? " seconds" : " second");

    return result;
  }
}
