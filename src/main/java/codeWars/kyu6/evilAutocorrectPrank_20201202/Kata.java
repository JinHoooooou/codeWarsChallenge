package codeWars.kyu6.evilAutocorrectPrank_20201202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

  public static String autocorrect(String input) {
    System.out.println(input);
    Pattern pattern = Pattern.compile("(\\byou+\\b)|(\\bu\\b)", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(input);
    String result = matcher.replaceAll("your sister");

    return result;
  }
}
