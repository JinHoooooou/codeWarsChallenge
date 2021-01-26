package codeWars.kyu5.phoneDirectory_20210126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDir {

  public static String phone(String strng, String num) {
    List<String> directories = new ArrayList<>(Arrays.asList(strng.split("\n")));
    List<String> results = getMatchPhoneNumber(directories, num);
    if (results.size() == 0) {
      return "Error => Not found: " + num;
    }
    if (results.size() > 1) {
      return "Error => Too many people: " + num;
    }
    return getResultString(results);
  }

  private static String getResultString(List<String> results) {
    String result = results.get(0);
    result = result.replaceAll("[/,;+$*!?:]", "");
    String num = "";
    String name = "";
    String address = "";

    Pattern pattern = Pattern.compile("\\d{1,2}-\\d{3}-\\d{3}-\\d{4}");
    Matcher matcher = pattern.matcher(result);
    matcher.find();
    num = matcher.group();
    result = result.replaceAll("\\d{1,2}-\\d{3}-\\d{3}-\\d{4}.?", "");

    pattern = Pattern.compile("<[\\w\\s']+>");
    matcher = pattern.matcher(result);
    matcher.find();
    name = matcher.group();
    name = name.substring(1, name.length() - 1);

    result = result.replaceAll("<[\\w\\s']+>", "");
    address = result.replaceAll("[_ ]+", " ").trim();

    return String.format("Phone => %s, Name => %s, Address => %s", num, name, address);
  }

  private static List<String> getMatchPhoneNumber(List<String> directories, String num) {
    List<String> list = new ArrayList<>();
    for (String directory : directories) {
      Pattern pattern = Pattern.compile("\\d{1,2}-\\d{3}-\\d{3}-\\d{4}");
      Matcher matcher = pattern.matcher(directory);

      while (matcher.find()) {
        if (matcher.group().equals(num)) {
          list.add(directory);
        }
      }
    }
    return list;
  }
}
