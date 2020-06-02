package codeWars.growthOfAPopulation;

public class Arge {

  public static int nbYear(int p0, double percent, int aug, int p) {
    double result = p0;
    int year = 0;
    while (result < p) {
      result = result + (result * (percent * 0.01)) + aug;
      year++;
    }

    return year;
  }
}
