package codeWars.kyu6.makeTheDeadfishSwim_20200714;

import java.util.ArrayList;
import java.util.List;

public class DeadFishAnotherSolution {

  public static int[] parse(String data) {

    List<Integer> result = new ArrayList<>();
    int value = 0;
    CommandFactory commandFactory = new CommandFactory(result);
    for (char code : data.toCharArray()) {
      Command command = commandFactory.getCommand(code);
      value = command.execute(value);
    }
    return new int[]{};
  }
}

class CommandFactory {

  private List<Integer> result;

  public CommandFactory(List<Integer> result) {
    this.result = result;
  }

  public Command getCommand(char code) {
    switch (code) {
      case 'i':
        return new IncrementCommand();
      case 'd':
        return new DecrementCommand();
      case 's':
        return new SquareCommand();
      case 'o':
        return new OutputCommand(result);
    }
    throw new RuntimeException("error");
  }
}

interface Command {

  int execute(int data);
}

class IncrementCommand implements Command {

  @Override
  public int execute(int data) {
    return data + 1;
  }
}

class DecrementCommand implements Command {

  @Override
  public int execute(int data) {
    return data - 1;
  }
}

class SquareCommand implements Command {

  @Override
  public int execute(int data) {
    return data * data;
  }
}

class OutputCommand implements Command {

  private List<Integer> result;

  public OutputCommand(List<Integer> result) {
    this.result = result;
  }

  @Override
  public int execute(int data) {
    result.add(data);
    return data;
  }
}
