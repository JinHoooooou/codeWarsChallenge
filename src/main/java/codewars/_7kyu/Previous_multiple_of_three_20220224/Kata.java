package codewars._7kyu.Previous_multiple_of_three_20220224;

public class Kata {

  public static Integer prevMultOfThree(int n) {
    while (n % 3 != 0 && n >= 10) {
      n /= 10;
    }
    return n % 3 == 0 ? n : null;
  }
}
