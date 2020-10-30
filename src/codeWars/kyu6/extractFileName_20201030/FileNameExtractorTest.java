package codeWars.kyu6.extractFileName_20201030;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FileNameExtractorTest {

  @Test
  public void test1() {
    assertThat(
        FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        , is("FILE_NAME.EXTENSION"));
  }
}