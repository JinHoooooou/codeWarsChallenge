package codeWars.kyu6.esolangInterpret1_20201209;

public class MyFirstInterpreter {

  private String code;

  public MyFirstInterpreter(String code) {
    this.code = code.replaceAll("[^+.]", "");
  }

  public String interpret() {
    StringBuilder result = new StringBuilder();
    char current = 0;

    while (code.contains(".")) {
      int index = code.indexOf('.');
      code = code.substring(index + 1);
      current = (char) ((current + index) % 256);
      result.append(current);
    }
    return result.toString();
  }
}
