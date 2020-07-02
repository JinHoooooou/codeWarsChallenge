package codeWars.kyu6.helpTheBookseller_20200702;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StockListBestPractice {

  private static class Book {

    public final String category;
    public final String code;
    public final int stock;

    public Book(String label) {
      this.category = label.charAt(0) + "";
      this.code = label.split(" ")[0];
      this.stock = Integer.parseInt(label.split(" ")[1]);
    }
  }

  public static String stockSummary(String[] lstOfArt, String[] lstOf1stletter) {
    if (lstOfArt.length == 0 || lstOf1stletter.length == 0) {
      return "";
    }
    Map<String, Integer> artMap = Arrays.stream(lstOfArt)
        .map(Book::new)
        .collect(Collectors.groupingBy(book -> book.category,
            Collectors.summingInt(book -> book.stock)));

    return Arrays.stream(lstOf1stletter)
        .map(x -> String.format("(%s : %d)", x, artMap.getOrDefault(x, 0)))
        .collect(Collectors.joining(" - "));
  }
}
