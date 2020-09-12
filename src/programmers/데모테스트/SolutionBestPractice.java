package programmers.데모테스트;

public class SolutionBestPractice {

  public int[] solution(int[][] v) {
    int[] result = new int[2];
    for (int i = 0; i < v.length; i++) {
      result[0] ^= v[i][0];
      result[1] ^= v[i][1];
    }
    return result;
  }
}
