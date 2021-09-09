package doNotSolve.programmers.level3.광고삽입;

public class Solution {

  /*
  처음 내가 한 생각 : play_time, adv_time, logs들을 전부 초로 바꾼 뒤에
  logs들의 시작, 끝에서 부터 광고를 시작해서 그 사이에 들어가는 adv_time들을 전부 더해줬다.
  근데 범위를 잘못 지정했는지 입출력 예 3번이 계속 틀려서 어쩔 수 없이 답을 봤더니
  전혀 다른 방법으로 해결했다.
  */

  public String solution(String play_time, String adv_time, String[] logs) {
    long[] playTime = new long[timeToSeconds(play_time) + 1];
    int advTime = timeToSeconds(adv_time);

    for (String log : logs) {
      int start = timeToSeconds(log.split("-")[0]);
      int end = timeToSeconds(log.split("-")[1]);

      playTime[start]++;
      playTime[end]--;
    }

    for (int i = 1; i < playTime.length; i++) {
      playTime[i] += playTime[i - 1];
    }
    for (int i = 1; i < playTime.length; i++) {
      playTime[i] += playTime[i - 1];
    }

    long max = playTime[advTime - 1];
    int startSeconds = 0;
    for (int i = 0; i + advTime < playTime.length; i++) {
      long accumulateSum = playTime[i + advTime] - playTime[i];
      if (accumulateSum > max) {
        max = accumulateSum;
        startSeconds = i + 1;
      }
    }

    return secondsToTime(startSeconds);
  }

  private String secondsToTime(int seconds) {
    int hour = seconds / 3600;
    int minute = (seconds % 3600) / 60;
    int second = (seconds % 3600) % 60;

    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  private int timeToSeconds(String time) {
    String[] times = time.split(":");
    int hour = Integer.parseInt(times[0]) * 3600;
    int minute = Integer.parseInt(times[1]) * 60;
    int second = Integer.parseInt(times[2]);
    return hour + minute + second;
  }
}
