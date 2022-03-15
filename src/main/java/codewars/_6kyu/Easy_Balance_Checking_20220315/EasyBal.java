package codewars._6kyu.Easy_Balance_Checking_20220315;

public class EasyBal {

  public static String balance(String book) {
    book = book.replaceAll("[^\\d\\w.\n ]", "");

    String[] lines = book.split("\n");
    double balance = Double.parseDouble(lines[0]);
    double priceSum = 0;
    StringBuilder result = new StringBuilder(
        String.format("Original Balance: %.2f\\r\\n", balance));

    for (int i = 1; i < lines.length; i++) {
      String[] tokens = lines[i].split(" +");
      double price = Double.parseDouble(tokens[2]);
      balance = Math.round((balance - price) * 100) / 100.0;
      priceSum += price;
      result.append(
          String.format("%s %s %s Balance %.2f\\r\\n", tokens[0], tokens[1], tokens[2], balance));
    }
    result.append(String.format("Total expense  %.2f\\r\\n", priceSum));
    result.append(String.format("Average expense  %.2f", priceSum / (lines.length - 1)));

    return result.toString().trim();
  }
}
