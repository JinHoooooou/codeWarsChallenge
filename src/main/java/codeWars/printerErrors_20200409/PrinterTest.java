package codeWars.printerErrors_20200409;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrinterTest {

  @Test
  public void testShouldReturnFormattedString() {
    // Given: Set string will not print error
    String given = "abcdefghijklm";
    // When: Call printerError method
    String actual = Printer.printerError(given);
    // Then: Should Return "error/total" string format
    assertEquals("0/13", actual);
  }

  @Test
  public void testShouldReturnNoErrorCountWhenStringContainsAtoM() {
    // Given: Set string contains a~m character
    String given = "ababcdhefefghhijkkllmmaa";
    // When: Call printerError method
    String actual = Printer.printerError(given);
    // Then: Should Return "error/total" string format
    assertEquals("0/24", actual);
  }

  @Test
  public void testShouldReturnMoreThan1ErrorCountWhenStringContainsNtoZ() {
    // Given: Set string contains a~m character
    String given = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
    // When: Call printerError method
    String actual = Printer.printerError(given);
    // Then: Should Return "error/total" string format
    assertEquals("3/56", actual);
  }
}