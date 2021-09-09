package codeWars.kyu8.MilesPerGallonToKilometersPerLiter_20201004;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

  @Test
  public void test1() {
    assertEquals(1465.58f, Converter.mpgToKPM(4140));
  }
}