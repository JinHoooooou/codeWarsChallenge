package codeWars.kyu5.simpleAssmeblerInterpreter_20210113;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleAssembler {

  public static Map<String, Integer> interpret(String[] program) {
    System.out.println(Arrays.toString(program));
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < program.length; i++) {
      String[] data = program[i].split(" ");
      String operation = data[0];
      String target = map.get(data[1]) == null ? data[1] : map.get(data[1]) + "";
      String value = data.length == 3 ? data[2] : "";

      if (operation.equals("mov")) {
        value = map.get(value) == null ? value : map.get(value) + "";
        map.put(data[1], Integer.parseInt(value));
      } else if (operation.equals("inc")) {
        map.put(data[1], map.get(data[1]) + 1);
      } else if (operation.equals("dec")) {
        map.put(data[1], map.get(data[1]) - 1);
      } else if (operation.equals("jnz") && Integer.parseInt(target) != 0) {
        value = map.get(value) == null ? value : map.get(value) + "";
        i = i + Integer.parseInt(value) - 1;
      }
    }

    return map;
  }
}
