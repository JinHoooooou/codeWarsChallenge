package programmers.findPrime;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public Set<Integer> permutationList = new HashSet<>();

  public int solution(String numbers) {
    fillPermutationList("", numbers);
    int primeCount = 0;
    for (Integer num : permutationList) {
      if (isPrime(num)) {
        primeCount++;
      }
    }
    return primeCount;
  }

  private boolean isPrime(Integer num) {
    if (num == 0 || num == 1) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  private void fillPermutationList(String prefix, String numbers) {
    if (!prefix.equals("")) {
      permutationList.add(Integer.parseInt(prefix));
    }

    for (int i = 0; i < numbers.length(); i++) {
      fillPermutationList(prefix + numbers.charAt(i),
          numbers.substring(0, i) + numbers.substring(i + 1));
    }
  }
}
