package programmers.level1.핸드폰번호가리기_20201030;

public class Solution {

  public String solution(String phoneNumber) {
    if (phoneNumber.length() == 4) {
      return phoneNumber;
    }
    String front = phoneNumber.substring(0, phoneNumber.length() - 4);
    String back = phoneNumber.substring(phoneNumber.length() - 4);

    return front.replaceAll("[0-9]", "*") + back;
  }
}
