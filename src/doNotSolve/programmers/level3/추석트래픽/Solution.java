package doNotSolve.programmers.level3.추석트래픽;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int solution(String[] lines) {
    List<Integer> starts = new ArrayList<>();
    List<Integer> startTimes = new ArrayList<>();
    List<Integer> endTimes = new ArrayList<>();
    timeToMilliseconds(lines, starts, startTimes, endTimes);

    int max = 0;
    for (int startSection : starts) {
      int count = 0;
      int endSection = startSection + 1000;
      for (int i = 0; i < lines.length; i++) {
        if (startTimes.get(i) >= startSection && startTimes.get(i) < endSection) {
          count++;
        } else if (endTimes.get(i) >= startSection && endTimes.get(i) < endSection) {
          count++;
        } else if (startTimes.get(i) <= startSection && endTimes.get(i) >= endSection) {
          count++;
        }
      }
      max = Math.max(max, count);
    }

    return max;
  }

  private void timeToMilliseconds(String[] lines, List<Integer> starts, List<Integer> startTimes,
      List<Integer> endTimes) {
    for (String line : lines) {
      String[] log = line.split(" ");
      int endTime = getSeconds(log[1]);
      int processTime = (int) (Double.parseDouble(log[2].replace("s", "")) * 1000);
      int startTime = endTime - processTime + 1;
      startTimes.add(startTime);
      endTimes.add(endTime);
    }
    starts.addAll(startTimes);
    starts.addAll(endTimes);
  }

  private int getSeconds(String time) {
    String[] split = time.split(":");
    return (Integer.parseInt(split[0]) * 60 * 60 * 1000)
        + (Integer.parseInt(split[1]) * 60 * 1000)
        + (int) (Double.parseDouble(split[2]) * 1000);
  }
}
