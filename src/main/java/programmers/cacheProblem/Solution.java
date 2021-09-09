package programmers.cacheProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  static final int CACHE_HIT = 1;
  static final int CACHE_MISS = 5;

  public int solution(int cacheSize, String[] cities) {
    Queue<String> cacheQueue = new LinkedList<>();
    int second = 0;
    for (String city : cities) {
      city = city.toLowerCase();
      if (cacheQueue.contains(city)) {
        cacheQueue.remove(city);
        second += CACHE_HIT;
      } else {
        second += CACHE_MISS;
      }
      cacheQueue.add(city);
      if (cacheQueue.size() > cacheSize) {
        cacheQueue.remove();
      }
    }
    return second;
  }
}
