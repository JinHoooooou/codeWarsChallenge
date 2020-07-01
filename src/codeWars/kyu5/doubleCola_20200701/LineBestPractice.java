package codeWars.kyu5.doubleCola_20200701;

public class LineBestPractice {

  public static String WhoIsNext(String[] names, int n) {
    while (n > names.length) {
      n = (n - names.length - 1) / 2;
    }
    return names[n - 1];
  }
}
