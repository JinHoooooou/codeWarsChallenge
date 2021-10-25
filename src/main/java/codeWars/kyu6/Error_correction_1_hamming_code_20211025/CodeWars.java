package codeWars.kyu6.Error_correction_1_hamming_code_20211025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodeWars {

  public String encode(String text) {
    StringBuilder encoding = new StringBuilder();
    for (int ascii : text.toCharArray()) {
      String binary = asciiToBinary(ascii);
      String trippled = oneBitToTriple(binary);
      encoding.append(trippled);
    }

    return encoding.toString();
  }

  public String decode(String concatTripples) {
    StringBuilder decoding = new StringBuilder();
    String concatBinary = trippleToBinary(concatTripples);
    for (int i = 0; i < concatBinary.length(); i += 8) {
      String binary = concatBinary.substring(i, i + 8);
      decoding.append(binaryToAscii(binary));
    }

    return decoding.toString();
  }


  private String asciiToBinary(int ascii) {
    StringBuilder binary = new StringBuilder(Integer.toBinaryString(ascii));
    while (binary.length() < 8) {
      binary.insert(0, "0");
    }
    return binary.toString();
  }

  private char binaryToAscii(String binary) {
    return (char) Integer.parseInt(binary, 2);
  }

  private String oneBitToTriple(String bianry) {
    String[] bits = bianry.split("");
    StringBuilder result = new StringBuilder();
    for (String bit : bits) {
      result.append(bit).append(bit).append(bit);
    }
    return result.toString();
  }

  private String trippleToBinary(String concatTripples) {
    String[] tripples = new String[concatTripples.length() / 3];
    for (int i = 0; i < tripples.length; i++) {
      tripples[i] = concatTripples.substring(0, 3);
      concatTripples = concatTripples.substring(3);
    }

    String concatBits = Arrays.stream(tripples)
        .map(x -> x.replaceAll("0", "").length() >= 2 ? "1" : "0").collect(Collectors.joining(""));
    return concatBits;
  }


}
