package codeWars.GetTheMiddleCharacter;

class Kata {

  public static String getMiddle(String word) {
    int middle = word.length() / 2;
    return (word.length() % 2 == 0) ? word.substring(middle - 1, middle + 1)
        : String.valueOf(word.charAt(middle));
  }
    /*
      public static String getMiddle(String word) {
        int length = word.length();
        int mid = length / 2;
        boolean isEven = length % 2 == 0;
        return isEven ? word.substring(mid - 1, mid + 1) :
                        String.valueOf(word.charAt(mid));
       }
     */

}
