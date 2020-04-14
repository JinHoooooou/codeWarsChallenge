package onesAndZeros_20200414;

import java.util.List;

public class BinaryArrayToNumber {

  public int convertBinaryArrayToInt(List<Integer> binary) {
    int sum = 0;
    int pow = binary.size() - 1;
    for (int i = 0; i < binary.size(); i++, pow--) {
      sum += binary.get(i) * Math.pow(2, pow);
    }
    return sum;

    //Best Practice
    //return binary.stream().reduce((tempResult, element) -> tempResult * 2 + element ).get();
  }
}
