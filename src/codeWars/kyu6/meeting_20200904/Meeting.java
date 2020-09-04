package codeWars.kyu6.meeting_20200904;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Meeting {

  public static String meeting(String s) {
    String[] guestList = s.toUpperCase().split(";");
    List<Name> resultList = new ArrayList<>();
    for (String guest : guestList) {
      String firstName = guest.split(":")[0];
      String lastName = guest.split(":")[1];
      resultList.add(new Name(firstName, lastName));
    }

    resultList.sort(Comparator.comparing(Name::getLast).thenComparing(Name::getFirst));
    String result = "";
    for (Name guests : resultList) {
      result += String.format("(%s, %s)", guests.getLast(), guests.getFirst());
    }

    return result;
  }
}

class Name {

  String first;
  String last;

  Name(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public String getFirst() {
    return first;
  }

  public String getLast() {
    return last;
  }
}
