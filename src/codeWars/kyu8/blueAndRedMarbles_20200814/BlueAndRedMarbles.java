package codeWars.kyu8.blueAndRedMarbles_20200814;

public class BlueAndRedMarbles {

  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    return (blueStart - bluePulled) / (double) ((blueStart - bluePulled) + (redStart - redPulled));
  }
}
