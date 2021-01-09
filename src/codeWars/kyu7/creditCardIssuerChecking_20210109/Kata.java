package codeWars.kyu7.creditCardIssuerChecking_20210109;

public class Kata {

  public static String getIssuer(String cardNumber) {
    if (cardNumber.matches("^3[4|7].{13}$")) {
      return "AMEX";
    }
    if (cardNumber.matches("^6011.{12}$")) {
      return "Discover";
    }
    if (cardNumber.matches("^5[1-5].{14}$")) {
      return "Mastercard";
    }
    if (cardNumber.matches("^4.{12}(...)?$")) {
      return "VISA";
    }
    return "Unknown";
  }

}
