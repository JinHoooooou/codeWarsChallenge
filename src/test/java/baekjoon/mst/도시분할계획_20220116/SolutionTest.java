package baekjoon.mst.도시분할계획_20220116;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class SolutionTest {


  @Test
  public void test1() throws IOException {
    String input = "7 12\n"
        + "1 2 3\n"
        + "1 3 2\n"
        + "3 2 1\n"
        + "2 5 2\n"
        + "3 4 4\n"
        + "7 3 6\n"
        + "5 1 5\n"
        + "1 6 2\n"
        + "6 4 1\n"
        + "6 5 3\n"
        + "4 5 3\n"
        + "6 7 4";

    OutputStream output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);
    Solution.main(new String[]{});
    assertThat("8", is(output.toString().trim()));
  }
}