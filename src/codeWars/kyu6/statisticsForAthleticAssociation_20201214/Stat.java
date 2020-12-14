package codeWars.kyu6.statisticsForAthleticAssociation_20201214;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stat {

  public static String stat(String strg) {
    if (strg.isEmpty()) {
      return "";
    }
    List<LocalTime> list = getSortedTimeList(strg);

    LocalTime range = getRange(list);
    LocalTime average = getAverage(list);
    LocalTime median = getMedian(list);

    return getResultString(range, average, median);
  }

  private static List<LocalTime> getSortedTimeList(String strg) {
    List<LocalTime> list = new ArrayList<>();
    String[] split = strg.split(", ");
    for (int i = 0; i < split.length; i++) {
      LocalTime temp = LocalTime.parse(split[i], DateTimeFormatter.ofPattern("H|mm|s"));
      list.add(temp);
    }
    list.sort(Comparator.naturalOrder());
    return list;
  }

  private static LocalTime getRange(List<LocalTime> list) {
    LocalTime min = list.get(0);
    LocalTime max = list.get(list.size() - 1);
    long seconds = min.until(max, ChronoUnit.SECONDS);

    return LocalTime.ofSecondOfDay(seconds);
  }

  private static LocalTime getAverage(List<LocalTime> list) {
    long seconds = 0;
    for (int i = 0; i < list.size(); i++) {
      seconds += list.get(i).toSecondOfDay();
    }
    return LocalTime.ofSecondOfDay(seconds / list.size());
  }

  private static LocalTime getMedian(List<LocalTime> list) {
    long seconds = 0;
    if (list.size() % 2 == 1) {
      seconds = list.get(list.size() / 2).toSecondOfDay();
    } else {
      seconds += list.get(list.size() / 2).toSecondOfDay();
      seconds += list.get(list.size() / 2 - 1).toSecondOfDay();
      seconds /= 2;
    }
    return LocalTime.ofSecondOfDay(seconds);
  }

  private static String getResultString(LocalTime range, LocalTime average, LocalTime median) {
    return String.format("Range: %s Average: %s Median: %s",
        range.format(DateTimeFormatter.ofPattern("HH|mm|ss")),
        average.format(DateTimeFormatter.ofPattern("HH|mm|ss")),
        median.format(DateTimeFormatter.ofPattern("HH|mm|ss")));
  }
}
