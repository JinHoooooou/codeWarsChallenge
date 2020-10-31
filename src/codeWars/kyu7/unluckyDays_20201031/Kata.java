package codeWars.kyu7.unluckyDays_20201031;

import java.util.Calendar;

public class Kata {

  public static int unluckyDays(int year) {
    Calendar cal = Calendar.getInstance();
    int unluckyCount = 0;
    for (int month = 0; month < 12; month++) {
      cal.set(year, month, 13);
      int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
      if (dayOfWeek == 6) {
        unluckyCount++;
      }
    }
    return unluckyCount;
  }
}
