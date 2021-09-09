package programmers.level1.콜라츠추측_20201029;

public class Solution {

  public int solution(int num) {
    int count = 0;
    if (num == 0) {
      return count;
    }
    long target = num;
    while (target != 1) {
      target = target % 2 == 0 ? target / 2 : target * 3 + 1;
      count++;
      if (count >= 500) {
        return -1;
      }
    }
    return count;
  }
}
