package tortoiseRacing_20200530;

public class Tortoise {

  public static int[] race(int v1, int v2, int g) {
    if (v1 >= v2) {
      return null;
    }
    int time = 3600 * g / (v2 - v1);
    int hour = time / 3600;
    int min = time % 3600 / 60;
    int second = time % 3600 % 60;
    return new int[]{hour, min, second};
  }
}
