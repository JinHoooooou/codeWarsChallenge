package codeWars.kyu7.inviteMoreWomen_20201112;

import java.util.Arrays;

public class Kata {

  public static boolean inviteMoreWomen(int[] l) {
    return Arrays.stream(l).sum() > 0;
  }
}
