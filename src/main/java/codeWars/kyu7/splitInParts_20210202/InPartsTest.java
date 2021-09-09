package codeWars.kyu7.splitInParts_20210202;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class InPartsTest {

  @Test
  public void test1() {
    assertThat(InParts.splitInParts("supercalifragilisticexpialidocious", 3),
        is("sup erc ali fra gil ist ice xpi ali doc iou s"));
  }
}