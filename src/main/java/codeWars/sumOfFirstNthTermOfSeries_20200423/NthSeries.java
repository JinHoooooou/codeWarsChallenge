package codeWars.sumOfFirstNthTermOfSeries_20200423;


public class NthSeries {

  public static String seriesSum(int n) {

    double sum = 0;
    int series = 1;
    for (int i = 0; i < n; i++) {
      sum += (double) 1 / series;
      series += 3;
    }

    return String.format("%.2f", sum);
//    Best Practice

//    double sum = 0;
//    for (int i = 0; i < n; i++) {
//      sum += (double) 1 / (1 + i * 3);
//    }
//
//    return String.format("%.2f", sum);

//    Best Practice 2
//    return String
//        .format("%.2f", IntStream.range(0, n).mapToDouble(a -> (double) 1 / (1 + a * 3)).sum());
  }
}
