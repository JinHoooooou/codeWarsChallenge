package findThePartyOutlier;


public class FindOutlier {

  public static int find(int[] integers) {
    int oddCount = 0;
    int evenCount = 0;
    for (int eachInteger : integers) {
      if (eachInteger % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }
    if (evenCount == 1) {
      for (int eachInteger : integers) {
        if (eachInteger % 2 == 0) {
          return eachInteger;
        }
      }
    }
    for (int eachInteger : integers) {
      if (eachInteger % 2 == 1 || eachInteger % 2 == -1) {
        return eachInteger;
      }
    }
    return 0;
  }

}
