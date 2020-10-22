package doNotSolve.codewars.kyu5.mySmallestCodeInterpreter_20201022;

import java.util.*;

public class BrainLuck {

  private String code;
  private ArrayList<Character> memory;

  public BrainLuck(String code) {
    this.code = code;
    this.memory = new ArrayList<>();
  }

  public String process(String input) {
    int inputPointer = 0, memoryPointer = 0;
    String result = "";
    for (int i = 0; i < code.length(); i++) {
      char c = code.charAt(i);
      if (c == '>') {
        memoryPointer++;
      } else if (c == '<') {
        memoryPointer--;
      } else if (c == '+') {
        saveToMemory(memoryPointer, (char) (getFromMemory(memoryPointer) + 1));
      } else if (c == '-') {
        saveToMemory(memoryPointer, (char) (getFromMemory(memoryPointer) - 1));
      } else if (c == '.') {
        result += getFromMemory(memoryPointer);
      } else if (c == ',') {
        saveToMemory(memoryPointer, input.charAt(inputPointer));
        inputPointer++;
      } else if (c == '[') {
        if (getFromMemory(memoryPointer) == 0) {
          i = getMatching('[', ']', i, 1);
        }
      } else if (c == ']') {
        if (getFromMemory(memoryPointer) != 0) {
          i = getMatching(']', '[', i, -1);
        }
      }
    }
    return result;
  }

  private void saveToMemory(int index, char input) {
    if (input > 255) {
      input = 0;
    } else if (input < 0) {
      input = 255;
    }
    for (int i = memory.size(); i <= index; i++) {
      memory.add((char) 0);
    }
    memory.set(index, input);
  }

  private char getFromMemory(int index) {
    if (index >= memory.size()) {
      return 0;
    } else {
      return memory.get(index);
    }
  }

  private int getMatching(char x, char match, int i, int dir) {
    int count = 0;
    while (i > 0 && i <= code.length()) {
      if (code.charAt(i) == x) {
        count++;
      } else if (code.charAt(i) == match) {
        count--;
      }
      if (count == 0) {
        break;
      }
      i += dir;
    }
    return i;
  }
}