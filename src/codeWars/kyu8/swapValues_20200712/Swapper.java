package codeWars.kyu8.swapValues_20200712;

public class Swapper {

  public Object[] arguments;

  public Swapper(Object[] args) {
    arguments = args;
  }

  public void swapValue() {
    Object[] args = new Object[]{arguments[0], arguments[1]};
    Object temp = args[0];
    args[0] = args[1];
    args[1] = temp;
    arguments = args;
  }
}
