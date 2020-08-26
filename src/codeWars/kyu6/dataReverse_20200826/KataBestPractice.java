package codeWars.kyu6.dataReverse_20200826;

public class KataBestPractice {

  public static final int BYTE_LENGTH = 8;

  public static int[] DataReverse(int[] data) {
    int[] reversedData = new int[data.length];
    for (int i = data.length - BYTE_LENGTH, j = 0; i >= 0; i -= BYTE_LENGTH, j += BYTE_LENGTH) {
      System.arraycopy(data, i, reversedData, j, BYTE_LENGTH);
    }
    return reversedData;
  }
}
