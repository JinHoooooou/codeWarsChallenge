package programmers.level1.신규아이디추천_20210507;

public class Solution {

  public String solution(String newId) {
    String advancedId = new KakaoID(newId)
        .toLowerCase()
        .removeInvalidLetter()
        .toSingleDot()
        .removeStartDot()
        .removeEndDot()
        .preventEmptyID()
        .preventLongerThan15()
        .preventShorterThan3()
        .getAdvancedID();

    return advancedId;
  }
}

class KakaoID {

  private String id;

  public KakaoID(String id) {
    this.id = id;
  }

  public KakaoID toLowerCase() {
    id = id.toLowerCase();
    return this;
  }

  public KakaoID removeInvalidLetter() {
    id = id.replaceAll("[^a-z0-9\\._\\-]", "");
    return this;
  }

  public KakaoID toSingleDot() {
    id = id.replaceAll("[.]{2,}", ".");
    return this;
  }

  public KakaoID removeStartDot() {
    id = id.replaceAll("^\\.", "");
    return this;
  }

  public KakaoID removeEndDot() {
    id = id.replaceAll("\\.$", "");
    return this;
  }

  public KakaoID preventEmptyID() {
    id = id.isEmpty() ? "a" : id;
    return this;
  }

  public KakaoID preventLongerThan15() {
    id = id.length() > 15 ? id.substring(0, 15) : id;
    removeEndDot();
    return this;
  }

  public KakaoID preventShorterThan3() {
    while (id.length() < 3) {
      id += id.charAt(id.length() - 1);
    }
    return this;
  }

  public String getAdvancedID() {
    return id;
  }
}