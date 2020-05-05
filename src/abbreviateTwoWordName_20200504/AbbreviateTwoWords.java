package abbreviateTwoWordName_20200504;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] eachName = name.toUpperCase().split(" ");

    return eachName[0].substring(0,1) +"." + eachName[1].substring(0,1);
  }
}
