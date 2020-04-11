package creditCardMask_20200408;

//15분
public class Maskify {

  public static final int UNMASK_STRING_LENGTH = 4;

  public static String maskify(String str) {
    if (str.length() <= UNMASK_STRING_LENGTH) {
      return str;
    }
    String unMaskString = str.substring(str.length() - UNMASK_STRING_LENGTH);
    String maskString = str.substring(0, str.length() - UNMASK_STRING_LENGTH)
        .replaceAll(".", "#");
    return maskString + unMaskString;
  }
}
