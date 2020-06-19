package codeWars.kyu8.dutyFree_20200619;

public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double price = normPrice * ((double) discount / 100);
    return (int) (hol / price);
  }
}
