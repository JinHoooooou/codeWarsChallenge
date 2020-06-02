package codeWars.numberOfPeopleInBus_20200420;

import java.util.ArrayList;

public class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int peopleInBus = 0;
    for (int[] stop : stops) {
      peopleInBus += stop[0] - stop[1];
    }
    return peopleInBus;
  }
}
