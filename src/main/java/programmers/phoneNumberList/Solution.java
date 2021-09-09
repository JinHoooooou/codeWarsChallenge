package programmers.phoneNumberList;

public class Solution {

  public boolean solution(String[] phoneBook) {
    for (int i = 0; i < phoneBook.length; i++) {
      String targetPhone = phoneBook[i];
      for (int j = 0; j < phoneBook.length; j++) {
        if (phoneBook[j].startsWith(targetPhone) && j != i) {
          return false;
        }
      }
    }
    return true;
  }
}
