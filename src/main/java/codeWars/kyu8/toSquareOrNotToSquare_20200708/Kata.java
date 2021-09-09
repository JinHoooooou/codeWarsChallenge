package codeWars.kyu8.toSquareOrNotToSquare_20200708;

public class Kata {

  public static int[] squareOrSquareRoot(int[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < result.length; i++) {
      if ((int) Math.sqrt(array[i]) == Math.ceil(Math.sqrt(array[i]))) {
        result[i] = (int) Math.sqrt(array[i]);
      } else {
        result[i] = array[i] * array[i];
      }
    }
    return result;
  }
}
