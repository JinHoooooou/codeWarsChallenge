package codeWars.kyu6.movesInSquaredStrings_20210311;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class Opstrings1Test {

  @Test
  public void testWhenCallRot() {
    assertThat(Opstrings1.oper(Opstrings1::rot,
        "fijuoo\nCqYVct\nDrPmMJ\nerfpBA\nkWjFUG\nCVUfyL"),
        is("LyfUVC\nGUFjWk\nABpfre\nJMmPrD\ntcVYqC\nooujif"));
  }

  @Test
  public void testWhenCallSelfieAndRot() {
    assertThat(Opstrings1.oper(Opstrings1::selfieAndRot, "xZBV\njsbS\nJcpN\nfVnP"),
        is("xZBV....\njsbS....\nJcpN....\nfVnP....\n....PnVf\n....NpcJ\n....Sbsj\n....VBZx"));
  }
}