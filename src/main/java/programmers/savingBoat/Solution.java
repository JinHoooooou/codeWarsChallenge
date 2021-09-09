package programmers.savingBoat;

import java.util.Arrays;

public class Solution {

  public int solution(int[] people, int limit) {
    Arrays.sort(people);

    int boatMoveCount = 0;
    int leftIndex = 0;
    for (int rightIndex = people.length - 1; rightIndex >= leftIndex; rightIndex--) {
      if (people[leftIndex] + people[rightIndex] <= limit) {
        leftIndex++;
      }
      boatMoveCount++;
    }
    return boatMoveCount;
  }
}
