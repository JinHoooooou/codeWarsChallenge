package countTheSmileyFaces_20200501;

import java.util.List;

public class SmileFaces {

  public static int countSmileys(List<String> arr) {
    int smileCount = 0;
    for (int i = 0; i < arr.size(); i++) {
      String face = arr.get(i);
      if (face.matches("^[:;][-~]?[)D]$")) {
        smileCount++;
      }
    }
    return smileCount;
  }
}
