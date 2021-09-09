package doNotSolve.programmers.level3.N으로표현;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Solution {

  Map<Integer, HashSet<Integer>> calculationResultMap;

  public int solution(int N, int number) {
    calculationResultMap = new HashMap<>();

    for (int i = 1; i < 9; i++) {
      HashSet<Integer> calculationResults = getCalculationValues(i, N);
      if (calculationResults.contains(number)) {
        return i;
      }
      calculationResultMap.put(i, calculationResults);
    }

    return -1;
  }

  private HashSet<Integer> getCalculationValues(int count, int N) {
    HashSet<Integer> set = new LinkedHashSet<>();
    int attach = getAttachValue(count, N);
    set.add(attach);

    for (int j = 1; j <= count / 2; j++) {
      for (int a : calculationResultMap.get(j)) {
        for (int b : calculationResultMap.get(count - j)) {
          for (Operator op : Operator.values()) {
            set.add(op.calcuate(a, b));
          }
        }
      }
    }

    return set;
  }

  private int getAttachValue(int count, int N) {
    return Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, count) - 1)) * N;
  }

}

enum Operator {
  PLUS {
    @Override
    public int calcuate(int a, int b) {
      return a + b;
    }
  },
  MINUS {
    @Override
    public int calcuate(int a, int b) {
      return a - b;
    }
  },
  BACKMINUS {
    @Override
    public int calcuate(int a, int b) {
      return b - a;
    }
  },
  MULTIPLY {
    @Override
    public int calcuate(int a, int b) {
      return a * b;
    }
  },
  DIVIDE {
    @Override
    public int calcuate(int a, int b) {
      return b == 0 ? 0 : a / b;
    }
  },
  BACKDIVIDE {
    @Override
    public int calcuate(int a, int b) {
      return a == 0 ? 0 : b / a;
    }
  };

  abstract int calcuate(int a, int b);
}