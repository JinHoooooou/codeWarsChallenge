package codeWars.kyu3.alphabeticAnangrams_20210208;

import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Anagrams {

  public BigInteger listPosition(String word) {
    if (word.isEmpty()) {
      return BigInteger.ONE;
    }
    Map<Character, Integer> alphabetCount = getAlphabetCount(word);
    String tempWord = word;
    char firstLetter = word.charAt(0);
    BigInteger count = BigInteger.ZERO;

    for (int i = 1; i < tempWord.length(); i++) {
      char tempLetter = tempWord.charAt(i);
      if (tempLetter < firstLetter && tempLetter != '.') {
        alphabetCount.replace(tempLetter, alphabetCount.get(tempLetter) - 1);
        count = count.add(getCount(alphabetCount, word.length() - 1));
        alphabetCount.replace(tempLetter, alphabetCount.get(tempLetter) + 1);
        tempWord = tempWord.replace(tempLetter, '.');
      }
    }

    count = count.add(listPosition(word.substring(1)));
    return count;
  }

  private Map<Character, Integer> getAlphabetCount(String word) {
    Map<Character, Integer> result = new TreeMap<>();
    for (Character alphabet : word.toCharArray()) {
      result.put(alphabet, result.getOrDefault(alphabet, 0) + 1);
    }
    return result;
  }

  private BigInteger getCount(Map<Character, Integer> alphabetCount, int lastLength) {
    BigInteger result = fac(lastLength);

    for (Entry<Character, Integer> entry : alphabetCount.entrySet()) {
      if (entry.getValue() > 1) {
        result = result.divide(fac(entry.getValue()));
      }
    }

    return result;
  }

  private BigInteger fac(int value) {
    BigInteger result = BigInteger.ONE;
    for (long i = value; i > 0; i--) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }
}
