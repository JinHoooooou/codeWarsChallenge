package codeWars.kyu8.catYearsDogYears_20200709;

public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catYears = 0;
    int dogYears = 0;
    for (int i = 0; i < humanYears; i++) {
      if (i == 0) {
        catYears += 15;
        dogYears += 15;
      } else if (i == 1) {
        catYears += 9;
        dogYears += 9;
      } else {
        catYears += 4;
        dogYears += 5;
      }
    }
    return new int[]{humanYears, catYears, dogYears};
  }
}
