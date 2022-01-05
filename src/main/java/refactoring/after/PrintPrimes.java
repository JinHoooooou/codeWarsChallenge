package refactoring.after;

public class PrintPrimes {

  static final int NUMBER_OF_PRIMES = 1000;
  static final int ROWS_PER_PAGE = 50;
  static final int COLUMNS_PER_PAGE = 4;

  public static void main(String[] args) {
    PrimeGenerator primePrinterHelper = new PrimeGenerator();
    int[] primes = primePrinterHelper.generatePrimes(NUMBER_OF_PRIMES);
    NumberPrinter numberPrinter = new NumberPrinter(ROWS_PER_PAGE, COLUMNS_PER_PAGE);
    numberPrinter.print(primes, NUMBER_OF_PRIMES);
  }

}

