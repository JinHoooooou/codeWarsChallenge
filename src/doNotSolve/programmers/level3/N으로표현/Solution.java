package doNotSolve.programmers.level3.N으로표현;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class Solution {


  public static int solution(int N, int number) {

    Map<Integer, HashSet<Integer>> calculationResultMap = init(N);

    for (int i = 1; i < 9; i++) {
      HashSet<Integer> calculationResults = new LinkedHashSet<>();
      int attach = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i) - 1)) * N;
      if (attach == number) {
        return i;
      }
      calculationResults.add(attach);

      for (int j = 1; j <= i / 2; j++) {
        for (int a : calculationResultMap.get(j)) {
          for (int b : calculationResultMap.get(i - j)) {
            for (Operator op : Operator.values()) {
              int result = op.calcuate(a, b);
              if (result == number) {
                return i;
              }
              calculationResults.add(op.calcuate(a, b));
            }
          }
        }
      }
      calculationResultMap.put(i, calculationResults);
    }

    return -1;
  }

  private static Map<Integer, HashSet<Integer>> init(int n) {
    Map<Integer, HashSet<Integer>> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    set.add(n);
    map.put(1, set);
    return map;
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