package baekjoon.shortest_path.해킹_20220325;

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

class MainTest {

  @Test
  public void test() throws IOException {
    String inputString = "2\n"
        + "3 2 2\n"
        + "2 1 5\n"
        + "3 2 5\n"
        + "3 3 1\n"
        + "2 1 2\n"
        + "3 1 8\n"
        + "3 2 4";
    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    System.setIn(input);
    OutputStream actual = new ByteArrayOutputStream();
    System.setOut(new PrintStream(actual));

    Main.main(new String[]{});

    String expected = "2 5\n"
        + "3 6";
    assertThat(actual.toString(), is(expected));

  }

  @Test
  public void test2() throws IOException {
    String inputString = "1\n"
        + "2 1 1\n"
        + "1 2 4";

    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    System.setIn(input);
    OutputStream actual = new ByteArrayOutputStream();
    System.setOut(new PrintStream(actual));

    Main.main(new String[]{});

    String expected = "1 0";
    assertThat(actual.toString(), is(expected));

  }
}