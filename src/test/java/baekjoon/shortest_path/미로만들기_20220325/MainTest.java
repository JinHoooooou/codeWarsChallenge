package baekjoon.shortest_path.미로만들기_20220325;

import static baekjoon.shortest_path.미로만들기_20220325.Main.main;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
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
  public void test1() throws IOException {
    String inputString = "8\n"
        + "11100110\n"
        + "11010010\n"
        + "10011010\n"
        + "11101100\n"
        + "01000111\n"
        + "00110001\n"
        + "11011000\n"
        + "11000111";

    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    setIn(input);
    OutputStream actual = new ByteArrayOutputStream();
    setOut(new PrintStream(actual));
    main(new String[]{});

    assertThat(actual.toString(), is("2"));
  }
}