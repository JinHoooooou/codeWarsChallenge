package doNotSolve.programmers.체육복;

public class Solution {

  public int solution(int n, int[] lost, int[] reserve) {
    int[] people = getLostAndReservePeople(n, lost, reserve);

    return getClothesCount(people);
  }

  private int getClothesCount(int[] people) {
    int result = people.length;
    for (int i = 0; i < people.length; i++) {
      if (people[i] == -1) {
        if (i - 1 > 0 && people[i - 1] == 1) {
          people[i]++;
          people[i - 1]--;
        } else if (i + 1 < people.length && people[i + 1] == 1) {
          people[i]++;
          people[i + 1]--;
        } else {
          result--;
        }
      }
    }

    return result;
  }

  private int[] getLostAndReservePeople(int n, int[] lost, int[] reserve) {
    int[] people = new int[n];

    for (int lostIndex : lost) {
      people[lostIndex - 1]--;
    }
    for (int reserveIndex : reserve) {
      people[reserveIndex - 1]++;
    }
    return people;
  }
}
