package codeWars.vasyaClerk_20200426;

public class Line {

  static final String NO = "NO";
  static final String YES = "YES";


  public String tickets(int[] peopleInLine) {
    int change25Count = 0;
    int change50Count = 0;
    int change100Count = 0;

    for (int i = 0; i < peopleInLine.length; i++) {
      if (peopleInLine[i] == 25) {
        change25Count++;
      } else if (peopleInLine[i] == 50) {
        if (change25Count > 0) {
          change25Count--;
          change50Count++;
        } else {
          return NO;
        }
      } else if (peopleInLine[i] == 100) {
        if (change25Count > 0 && change50Count > 0) {
          change25Count--;
          change50Count--;
          change100Count++;
        } else if (change25Count > 2) {
          change25Count -= 3;
          change100Count++;
        } else {
          return NO;
        }
      } else {
        return NO;
      }
    }
    return peopleInLine.length == 0 ? NO : YES;
  }
}