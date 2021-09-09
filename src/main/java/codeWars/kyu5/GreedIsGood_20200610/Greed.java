package codeWars.kyu5.GreedIsGood_20200610;

public class Greed {

  public static int greedy(int[] dice) {
    int[] count = new int[7];
    for (int i = 0; i < dice.length; i++) {
      count[dice[i]]++;
    }
    return (count[1] / 3 * 1000) + (count[1] % 3 * 100) + (count[2] / 3 * 200)
        + (count[3] / 3 * 300) + (count[4] / 3 * 400) + (count[5] / 3 * 500)
        + (count[5] % 3 * 50) + (count[6] / 3 * 600);
  }
}
