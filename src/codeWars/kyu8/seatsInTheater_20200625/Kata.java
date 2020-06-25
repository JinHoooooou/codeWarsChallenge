package codeWars.kyu8.seatsInTheater_20200625;

public class Kata {

  public static int seatsInTheater(int nCols, int nRows, int col, int row) {
    return (nCols - col + 1) * (nRows - row);
  }
}
