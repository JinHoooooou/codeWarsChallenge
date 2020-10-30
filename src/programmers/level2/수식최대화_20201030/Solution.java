package programmers.level2.수식최대화_20201030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

  Set<String> operationPrioritySet;
  boolean[] visit;

  public long solution(String expression) {
    makeOperatorPriority(expression);

    long result = 0;
    for (String operationPriority : operationPrioritySet) {
      result = Math.max(result, calculateByPriority(expression, operationPriority));
    }
    return result;
  }

  private void makeOperatorPriority(String expression) {
    String distinctOperator = Arrays.stream(
        expression.replaceAll("[\\d]", "").split(""))
        .distinct()
        .collect(Collectors.joining());
    visit = new boolean[distinctOperator.length()];
    operationPrioritySet = new HashSet<>();
    permutation("", distinctOperator);
  }

  private long calculateByPriority(String expression, String operatorPriority) {

    List<Long> numbers = makeNumbers(expression);
    List<String> operators = makeOperators(expression);
    operators.remove(0);

    for (int i = 0; i < operatorPriority.length(); i++) {
      String targetPriorityOperator = operatorPriority.charAt(i) + "";
      while (operators.contains(targetPriorityOperator)) {
        int index = operators.indexOf(targetPriorityOperator);
        calculate(numbers, index, targetPriorityOperator);
        operators.remove(index);
      }
    }

    return Math.abs(numbers.get(0));
  }

  private void calculate(List<Long> numbers, int index, String operator) {
    if (operator.equals("*")) {
      numbers.add(index, numbers.remove(index) * numbers.remove(index));
    } else if (operator.equals("+")) {
      numbers.add(index, numbers.remove(index) + numbers.remove(index));
    } else {
      numbers.add(index, numbers.remove(index) - numbers.remove(index));
    }
  }

  private List<String> makeOperators(String expression) {
    return new ArrayList<>(Arrays.asList(expression.split("\\d{1,3}")));
  }

  private List<Long> makeNumbers(String expression) {
    return new ArrayList<>(Arrays.asList(
        Arrays.stream(expression.split("\\D"))
            .mapToLong(Long::parseLong)
            .boxed()
            .toArray(Long[]::new)));
  }

  private void permutation(String current, String operations) {
    if (current.length() == operations.length()) {
      operationPrioritySet.add(current);
      return;
    }

    for (int i = 0; i < operations.length(); i++) {
      if (!visit[i]) {
        visit[i] = true;
        permutation(current + operations.charAt(i), operations);
        visit[i] = false;
      }
    }
  }
}
