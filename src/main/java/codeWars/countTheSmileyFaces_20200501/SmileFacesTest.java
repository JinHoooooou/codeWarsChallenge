package codeWars.countTheSmileyFaces_20200501;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmileFacesTest {

  @Test
  @DisplayName("test should return 2 when input is {:), :D, :-}, :-()}")
  public void test1() {
    // Given: Set face array
    List<String> given = new ArrayList<>();
    given.add(":)");
    given.add(":D");
    given.add(":-}");
    given.add(":-()");

    // Then: Should return 2
    assertEquals(2, SmileFaces.countSmileys(given));
  }

  @Test
  @DisplayName("test should return 1 when input is {:), XD, :0}, X:-, ):-, D:}")
  public void test2() {
    // Given: Set face array
    List<String> given = new ArrayList<>();
    given.add(":)");
    given.add("XD");
    given.add(":0}");
    given.add("x:-");
    given.add("):-");
    given.add("D:");

    // Then: Should return 1
    assertEquals(1, SmileFaces.countSmileys(given));
  }

  @Test
  @DisplayName("test should return 4 when input is {:), :), x-], :ox, ;-(, ;-), ;~(, :~D, D:}")
  public void test3() {
    // Given: Set face array
    List<String> given = new ArrayList<>();
    given.add(":)");
    given.add(":)");
    given.add("x-]");
    given.add(":ox");
    given.add(";-(");
    given.add(";-)");
    given.add(";~(");
    given.add(":~D");
    given.add("D:");

    // Then: Should return 4
    assertEquals(4, SmileFaces.countSmileys(given));
  }
}