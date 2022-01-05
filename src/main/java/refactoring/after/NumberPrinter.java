package refactoring.after;

public class NumberPrinter {

  private int rowsPerPage;
  private int columnsPerPage;

  public NumberPrinter(int rowsPerPage, int columnsPerPage) {
    this.rowsPerPage = rowsPerPage;
    this.columnsPerPage = columnsPerPage;
  }


  public void print(int[] numbers, int numberOfPrimes) {
    int pageNumber = 1;
    int countOfPrintingNumberPerPage = rowsPerPage * columnsPerPage;

    for (int firstIndexPerPage = 1; firstIndexPerPage < numbers.length;
        firstIndexPerPage += countOfPrintingNumberPerPage) {
      int lastIndexPerPage = Math
          .min(firstIndexPerPage + countOfPrintingNumberPerPage - 1, numbers.length - 1);
      printHeader(numberOfPrimes, pageNumber++);

      int firstIndexOfLastRowPerPage = firstIndexPerPage + rowsPerPage - 1;

      for (int firstIndexInRow = firstIndexPerPage;
          firstIndexInRow <= firstIndexOfLastRowPerPage;
          firstIndexInRow++) {
        for (int colum = 0; colum < columnsPerPage; colum++) {
          int index = firstIndexInRow + colum * rowsPerPage;
          if (index <= lastIndexPerPage) {
            System.out.format("%10d", numbers[index]);
          }
        }
        System.out.println("");
      }
      System.out.println("\f");
    }

  }

  private void printHeader(int numberOfPrimes, int pageNumber) {
    System.out
        .println("The First " + numberOfPrimes + " Prime Numbers --- Page " + pageNumber);
    System.out.println();
  }
}
