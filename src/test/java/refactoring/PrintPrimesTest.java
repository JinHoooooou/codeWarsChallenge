package refactoring;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import refactoring.after.PrintPrimes;

class PrintPrimesTest {

  private PrintStream out;

  @BeforeEach
  public void setUp() throws FileNotFoundException {
    out = System.out;
    System.setOut(new PrintStream(new FileOutputStream("lead")));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(out);
    new File("delete").delete();
  }

  @Test
  public void test_should_matches_with_gold() throws IOException {
    PrintPrimes.main(new String[0]);
    BufferedReader lead = new BufferedReader(new FileReader("lead"));
    BufferedReader gold = new BufferedReader(new FileReader("src/test/java/refactoring/gold"));
    String line;
    while ((line = gold.readLine()) != null) {
      assertThat(line, is(lead.readLine()));
    }
    assertThat(null, is(lead.readLine()));
  }
}