package codeWars.kyu6.buyingCar_20200710;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyCarTest {

  @Test
  @DisplayName("test should return [6,766]")
  public void test1() {
    // Given: Set input
    int startPriceOld = 2000;
    int startPriceNew = 8000;
    int savingPerMonth = 1000;
    double percentLossByMonth = 1.5;

    // Then: Should return 6 months, left 766
    assertArrayEquals(new int[]{6, 766},
        BuyCar.nbMonths(startPriceOld, startPriceNew, savingPerMonth, percentLossByMonth));
  }
}