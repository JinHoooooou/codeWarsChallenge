package codeWars.centuryFromYear_20200421;

public class Solution {

  public static int century(int number) {

    if (number <= 0) {
      return 0;
    }
    return number % 100 == 0 ? number / 100 : number / 100 + 1;

    // Best Practice
    //return (number+99) / 100;
  }
}
