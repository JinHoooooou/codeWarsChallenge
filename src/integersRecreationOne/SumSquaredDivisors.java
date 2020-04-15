package integersRecreationOne;

import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {

  public String listSquared(long m, long n) {

    long sumOfList = 1;
    List<Long> listSquareOfDivisor;
    List<String> listSquared = new ArrayList<>();

    for (long target = m; target <= n; target++) {
      listSquareOfDivisor = makeListSquareOfDivisor(target);
      sumOfList = listSquareOfDivisor.stream().reduce(Long::sum).get();
      if (isSquareOfSomeNumber(sumOfList)) {
        listSquared.add("[" + target + ", " + sumOfList + "]");
      }
    }

    String middleResult = String.join(", ", listSquared);
    return String.format("[%s]", middleResult);
  }

  private boolean isSquareOfSomeNumber(long sumOfList) {
    long sqrtOfSum = (long) Math.sqrt(sumOfList);
    return sqrtOfSum * sqrtOfSum == sumOfList;
  }

  private List<Long> makeListSquareOfDivisor(long target) {
    List<Long> result = new ArrayList<>();
    for (long i = 1; i <= target; i++) {
      if (target % i == 0) {
        result.add(i * i);
      }
    }
    return result;
  }

}
