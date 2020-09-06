package programmers.자물쇠와열쇠;

public class Solution {

  public boolean solution(int[][] key, int[][] lock) {
    int padLength = lock.length - 1;
    for (int i = 0; i < 4; i++) {
      key = rotate(key, i);
      int[][] paddedKey = padding(key, padLength);
      for (int padRow = 0; padRow < paddedKey.length - padLength; padRow++) {
        for (int padCol = 0; padCol < paddedKey.length - padLength; padCol++) {
          if (correct(paddedKey, lock, padRow, padCol)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean correct(int[][] key, int[][] lock, int padRow, int padCol) {
    for (int i = 0; i < lock.length; i++) {
      for (int j = 0; j < lock.length; j++) {
        if (lock[i][j] + key[i + padRow][j + padCol] != 1) {
          return false;
        }
      }
    }
    return true;
  }

  private int[][] padding(int[][] key, int padLength) {

    int[][] paddedKey = new int[key.length + padLength * 2][key.length + padLength * 2];
    for (int i = 0; i < key.length; i++) {
      for (int j = 0; j < key.length; j++) {
        paddedKey[padLength + i][padLength + j] = key[i][j];
      }
    }
    return paddedKey;
  }

  private int[][] rotate(int[][] key, int count) {
    if (count == 0) {
      return key;
    }
    int[][] rotateKey = new int[key.length][key.length];
    for (int j = 0; j < key.length; j++) {
      for (int k = 0; k < key.length; k++) {
        rotateKey[k][j] = key[key.length - 1 - j][k];
      }
    }
    return rotateKey;
  }
}
