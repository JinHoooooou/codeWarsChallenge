package codeWars.kyu7.movesInSquaredStrings_20200921;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OpstringsTest {

  String string = "abcd\nefgh\nijkl\nmnop";

  @Test
  public void vertMirrorTest() {
    String expected = "dcba\nhgfe\nlkji\nponm";

    assertEquals(expected, Opstrings.vertMirror(string));
  }

  @Test
  public void horMirrorTest() {
    String expected = "mnop\nijkl\nefgh\nabcd";

    assertEquals(expected, Opstrings.horMirror(string));
  }

  @Test
  public void operTest() {
    String horExpected = "mnop\nijkl\nefgh\nabcd";
    String vertExpected = "dcba\nhgfe\nlkji\nponm";
    assertEquals(horExpected, Opstrings.oper(Opstrings::horMirror, string));
    assertEquals(vertExpected, Opstrings.oper(Opstrings::vertMirror, string));
  }
}