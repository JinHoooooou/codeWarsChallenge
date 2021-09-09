package codeWars.kyu4.stripComments_20200604;

import java.util.ArrayList;

public class StripComments {

  public static String stripComments(String text, String[] commentSymbols) {
    ArrayList<String> resultList = new ArrayList<>();
    for (String line : text.split("\n")) {
      resultList.add(eraseCommentsAndSpace(line, commentSymbols));
    }
    return String.join("\n", resultList);
  }

  private static String eraseCommentsAndSpace(String line, String[] commentSymbols) {
    for (String commentSymbol : commentSymbols) {
      if (line.contains(commentSymbol)) {
        int indexOfCommentSymbol = line.indexOf(commentSymbol);
        line = line.substring(0, indexOfCommentSymbol);
      }
    }
    return line.replaceFirst("\\s+$", "");
  }
}
