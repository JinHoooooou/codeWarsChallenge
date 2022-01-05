package programmers.방금그곡;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {

  public String solution(String m, String[] musicInfos) throws ParseException {
    List<Music> resultList = new ArrayList<>();
    String myMelody = replaceSharpToLowerCase(m);

    for (String musicInfo : musicInfos) {
      Music music = getMusic(musicInfo);
      if (music.musicNote.contains(myMelody)) {
        resultList.add(music);
      }
    }
    resultList.sort((o1, o2) -> {
      if (o1.playTimeMinute > o2.playTimeMinute) {
        return -1;
      }
      return 0;
    });
    return resultList.isEmpty() ? "(None)" : resultList.get(0).title;
  }

  private String replaceSharpToLowerCase(String m) {
    String[] sharp = {"C#", "D#", "F#", "G#", "A#"};
    String[] lowerCase = {"c", "d", "f", "g", "a"};
    for (int i = 0; i < sharp.length; i++) {
      m = m.replaceAll(sharp[i], lowerCase[i]);
    }
    return m;
  }

  private Music getMusic(String musicInfo) throws ParseException {
    String title = musicInfo.split(",")[2];
    int runningMinute = getRunningMinute(musicInfo);
    String musicNote = getMusicNote(musicInfo, runningMinute);

    return new Music(title, musicNote, runningMinute);
  }

  private String getMusicNote(String musicInfo, int runningMinute) {
    String musicNote = replaceSharpToLowerCase(musicInfo.split(",")[3]);
    int loopCount = runningMinute / musicNote.length();
    String result = musicNote;
    for (int i = 0; i < loopCount; i++) {
      result += musicNote;
    }
    return result.substring(0, runningMinute);
  }

  private int getRunningMinute(String musicInfos) throws ParseException {
    String[] split = musicInfos.split(",");
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Date startTime = format.parse(split[0]);
    Date endTime = format.parse(split[1]);
    long playTimeMinute = (endTime.getTime() - startTime.getTime()) / (1000 * 60);

    return (int) playTimeMinute;
  }
}

class Music {

  String title;
  String musicNote;
  Integer playTimeMinute;

  public Music(String title, String musicNote, Integer playTimeMinute) {
    this.title = title;
    this.musicNote = musicNote;
    this.playTimeMinute = playTimeMinute;
  }
}