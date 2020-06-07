package codeWars.kyu6.rectangleIntoSquare_20200607;

import java.util.ArrayList;
import java.util.List;

public class SqinRectBestPractice {

  public static List<Integer> sqInRectBest(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    } else if (wdth > lng) {
      return sqInRectBest(wdth, lng);
    }
    List<Integer> result = new ArrayList<>();
    result.add(wdth);
    result.addAll(sqInRectBest(wdth, lng - wdth));
    return result;
  }

  public static List<Integer> sqInRectAnother(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
    int rectangleArea = lng * wdth;
    while (rectangleArea != 0) {
      result.add(Math.min(lng, wdth));
      if (lng > wdth) {
        lng -= wdth;
      } else {
        wdth -= lng;
      }
      rectangleArea = lng * wdth;
    }
    return result;
  }
}
