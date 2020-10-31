package codeWars.kyu7.unluckyDays_20201031;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kata {

  public static int unluckyDays(int year) {
    int count = 0;
    for (int month = 1; month <= 12; month++) {
      LocalDate date = LocalDate.of(year, month, 13);
      if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
        count++;
      }
    }
    return count;
  }
}
