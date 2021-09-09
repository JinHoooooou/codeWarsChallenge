package codeWars.kyu7.partsOfList_20200809;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PartlistTest {

  @Test
  public void test1() {
    String[] s1 = new String[]{"cdIw", "tzIy", "xDu", "rThG"};
    String a = "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]";
    assertEquals(a, Partlist.partlist(s1));

  }
}