package algorithm.dynamicProgramming.knapsackProblem01;

public class Knapsack {

  public int solution(int[][] weightAndValue, int bagWeight) {
    int[][] table = new int[weightAndValue.length + 1][bagWeight + 1];

    for (int i = 1; i < table.length; i++) {

      int weight = weightAndValue[i - 1][0];
      int value = weightAndValue[i - 1][1];

      for (int j = 1; j < table[i].length; j++) {
        table[i][j] = j >= weight
            ? Math.max(table[i - 1][j], value + table[i - 1][j - weight])
            : table[i - 1][j];
      }
    }

    return table[table.length - 1][bagWeight];
  }
}
