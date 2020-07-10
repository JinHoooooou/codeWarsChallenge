package codeWars.kyu6.buyingCar_20200710;

public class BuyCar {

  public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingPerMonth,
      double percentLossByMonth) {
    int saving = 0;
    double oldCarPrice = startPriceOld;
    double newCarPrice = startPriceNew;
    int months = 0;
    while (saving + oldCarPrice < newCarPrice) {
      months++;
      saving += savingPerMonth;
      if (months % 2 == 0) {
        percentLossByMonth += 0.5;
      }
      oldCarPrice -= (oldCarPrice * percentLossByMonth / 100.0);
      newCarPrice -= (newCarPrice * percentLossByMonth / 100.0);
    }

    return new int[]{months, (int) Math.round(saving + oldCarPrice - newCarPrice)};
  }
}
