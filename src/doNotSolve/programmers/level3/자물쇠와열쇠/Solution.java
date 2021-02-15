package doNotSolve.programmers.level3.자물쇠와열쇠;

public class Solution {

  public boolean solution(int[][] key, int[][] lock) {
    for (int i = 0; i < 4; i++) {
      rotate(key);
      int[][] paddedKey = pad(key, lock.length - 1);
      for (int padRow = 0; padRow < paddedKey.length - lock.length - 1; padRow++) {
        for (int padCol = 0; padCol < paddedKey.length - lock.length - 1; padCol++) {
          if (isValid(paddedKey, lock, padRow, padCol)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private int[][] pad(int[][] key, int padSize) {
    int[][] paddedKey = new int[key.length + padSize * 2][key.length + padSize * 2];

    for (int i = padSize; i < key.length + padSize; i++) {
      for (int j = padSize; j < key.length + padSize; j++) {
        paddedKey[i][j] = key[i - padSize][j - padSize];
      }
    }
    return paddedKey;
  }

  private boolean isValid(int[][] paddedKey, int[][] lock, int padRow, int padCol) {
    for (int k = 0; k < lock.length; k++) {
      for (int l = 0; l < lock.length; l++) {
        if (lock[k][l] + paddedKey[padRow + k][padCol + l] != 1) {
          return false;
        }
      }
    }
    return true;
  }


  private void rotate(int[][] key) {
    int[][] rotateKey = new int[key.length][key.length];
    for (int i = 0; i < key.length; i++) {
      for (int j = 0; j < key.length; j++) {
        rotateKey[i][j] = key[key.length - 1 - j][i];
      }
    }
    for (int i = 0; i < key.length; i++) {
      for (int j = 0; j < key.length; j++) {
        key[i][j] = rotateKey[i][j];
      }
    }
  }
}
