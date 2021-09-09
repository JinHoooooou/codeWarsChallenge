package codeWars.kyu6.consonantValue_20200923;

import java.util.stream.Stream;

public class ConsonantValueBestPractice {

  public static int solve(final String s) {
    return Stream.of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(ch -> ch - 96).sum()).max()
        .orElse(0);
  }
}
