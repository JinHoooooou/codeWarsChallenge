package codeWars.kyu4.recoverSecretStringFromRandomTriplets_20200802;

import java.util.LinkedList;
import java.util.List;

public class SecretDetective {

  public String recoverSecret(char[][] triplets) {
    List<Character> wordList = new LinkedList<>();
    for (char[] triplet : triplets) {
      int pIndex = -1;
      for (int i = 0; i < 3; i++) {
        int cIndex = wordList.indexOf(triplet[i]);
        if (cIndex != -1) {
          if (pIndex > cIndex) {
            Character removed = wordList.remove(cIndex);
            wordList.add(pIndex, removed);
            cIndex = pIndex;
          }
          pIndex = cIndex;
        } else if (pIndex != -1) {
          pIndex += 1;
          wordList.add(pIndex, triplet[i]);
        } else {
          wordList.add(0, triplet[i]);
          pIndex = 0;
        }
      }
    }
    return wordList.stream().map(ch -> ch.toString()).reduce((p, n) -> p + n).get();
  }
}