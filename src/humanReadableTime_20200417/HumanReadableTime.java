package humanReadableTime_20200417;

public class HumanReadableTime {

  public static String makeReadable(int seconds) {

    int intHour = seconds / 3600;
    int intMinute = seconds % 3600 / 60;
    int intSecond = seconds % 3600 % 60;

    String hour = intHour < 10 ? "0" + intHour : "" + intHour;
    String minute = intMinute < 10 ? "0" + intMinute : "" + intMinute;
    String second = intSecond < 10 ? "0" + intSecond : "" + intSecond;

    return seconds > 0 ? String.format("%s:%s:%s",hour, minute, second) : null;

    //Best Practice
    //return seconds > 0 ? String.format("%02d:%02d:%02d",intHour, intMinute, intSecond) : null;
  }
}
