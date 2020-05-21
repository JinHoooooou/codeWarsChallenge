package totalAmountOfPoints_20200521;

public class TotalPoints {

  public static int points(String[] games) {
    int point = 0;
    for (String score : games) {
      int myScore = score.charAt(0);
      int yourScore = score.charAt(2);
      if (myScore > yourScore) {
        point += 3;
      }
      if (myScore == yourScore) {
        point += 1;
      }
    }
    return point;
  }
}
