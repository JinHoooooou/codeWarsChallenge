package humanReadableDurationFormat_20200519;

public class TimeFormatter {

  public static String formatDuration(int seconds) {
    String result = "";
    if (seconds >= 60) {
      if (seconds / 60 > 1) {
        result = seconds / 60 + " minutes and ";
      } else {
        result = seconds / 60 + " minute and ";
      }
    }
    if (seconds % 60 > 1) {
      result = result + seconds % 60 + " seconds";
    } else {
      result = result + seconds % 60 + " second";
    }

    return result;
  }
}
