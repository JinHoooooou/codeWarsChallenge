package codewars._6kyu.Catalog_20220324;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

  public static String catalog(String s, String article) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String sheet : s.split("\n\n")) {
      if (sheet.contains(article)) {
        stringBuilder.append(format(sheet)).append("\n");
      }
    }

    String result = stringBuilder.toString().trim();

    return result.isEmpty() ? "Nothing" : result;
  }

  private static String format(String sheet) {
    List<String> tokens = new ArrayList<>();
    while (!sheet.isEmpty()) {
      int index = sheet.indexOf("<");
      if (index == 0) {
        sheet = sheet.substring(sheet.indexOf(">") + 1);
      } else {
        tokens.add(sheet.substring(0, index));
        sheet = sheet.substring(index);
      }
    }
    return String.format("%s > prx: $%s qty: %s", tokens.get(0), tokens.get(1), tokens.get(2));
  }
}
