package codeWars.kyu6.rectangleIntoSquare_20200607;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
    int rectangleArea = lng * wdth;
    int squareLength = (int) Math.sqrt(rectangleArea);
    while (rectangleArea != 0) {
      if (isMadeSquare(squareLength, lng, wdth)) {
        rectangleArea -= (squareLength * squareLength);
        result.add(squareLength);
        if (wdth > lng) {
          wdth -= squareLength;
        } else {
          lng -= squareLength;
        }
      } else {
        squareLength--;
      }
    }
    return result;
  }


  private static boolean isMadeSquare(int squareLength, int lng, int wdth) {
    return (squareLength * squareLength <= lng * wdth) && (squareLength <= lng
        && squareLength <= wdth);
  }
}
