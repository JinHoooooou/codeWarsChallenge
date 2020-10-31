package codeWars.kyu7.colouredTriangles_20201031;

public class Kata {

  public static char triangle(final String row) {
    if (row.length() == 1) {
      return row.charAt(0);
    }
    String nextRow = "";
    for (int i = 0; i < row.length() - 1; i++) {
      char color1 = row.charAt(i);
      char color2 = row.charAt(i + 1);
      switch (color1) {
        case 'R':
          nextRow += color2 == 'R' ? "R" : color2 == 'G' ? "B" : "G";
          break;
        case 'B':
          nextRow += color2 == 'R' ? "G" : color2 == 'G' ? "R" : "B";
          break;
        case 'G':
          nextRow += color2 == 'R' ? "B" : color2 == 'G' ? "G" : "R";
          break;
      }
    }
    return triangle(nextRow);
  }
}
