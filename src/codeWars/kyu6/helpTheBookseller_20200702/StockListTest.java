package codeWars.kyu6.helpTheBookseller_20200702;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StockListTest {

  String[] lstOfArt = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};

  @Test
  @DisplayName("test should return '(A : 200)")
  public void test1() {
    // Given: Set input
    String[] lstOf1stLetter = {"A"};

    // Then: Should return "(A : 200)"
    assertEquals("(A : 200)", StockList.stockSummary(lstOfArt, lstOf1stLetter));
  }

  @Test
  @DisplayName("test should return '(A : 200) - (B : 1140)")
  public void test2() {
    // Given: Set input
    String[] lstOf1stLetter = {"A", "B"};

    // Then: Should return "(A : 200) - (B : 1140)"
    assertEquals("(A : 200) - (B : 1140)", StockList.stockSummary(lstOfArt, lstOf1stLetter));
  }
}