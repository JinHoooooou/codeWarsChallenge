package codeWars.kyu6.backspacesInString_20201005;

import static org.junit.Assert.*;

import org.junit.Test;

public class BackspacesInStringTest {

  @Test
  public void test1() {
    assertEquals("bd", new BackspacesInString().cleanString("a#bc#d"));
  }

  @Test
  public void test2() {
    assertEquals("ac", new BackspacesInString().cleanString("abc#d##c"));
  }

  @Test
  public void test3() {
    assertEquals("jf", new BackspacesInString().cleanString("abjd####jfk#"));
  }
}