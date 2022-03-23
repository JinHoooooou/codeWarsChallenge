package baekjoon.shortest_path.특정_거리의_도시_찾기_20220323;

import static baekjoon.shortest_path.특정_거리의_도시_찾기_20220323.Main.main;
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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

  @AfterEach
  public void tearDown() {
    setOut(System.out);
    setIn(System.in);
  }


  @Test
  public void test1() throws IOException {
    String inputString = "4 4 2 1\n"
        + "1 2\n"
        + "1 3\n"
        + "2 3\n"
        + "2 4";

    OutputStream actual = new ByteArrayOutputStream();
    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    setOut(new PrintStream(actual));
    setIn(input);
    main(new String[]{});

    assertThat(actual.toString(), is("4"));
  }

  @Test
  public void test2() throws IOException {
    String inputString = "4 3 2 1\n"
        + "1 2\n"
        + "1 3\n"
        + "1 4";

    OutputStream actual = new ByteArrayOutputStream();
    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    setOut(new PrintStream(actual));
    setIn(input);
    main(new String[]{});

    assertThat(actual.toString(), is("-1"));
  }

  @Test
  public void test3() throws IOException {
    String inputString = "4 4 1 1\n"
        + "1 2\n"
        + "1 3\n"
        + "2 3\n"
        + "2 4";

    OutputStream actual = new ByteArrayOutputStream();
    InputStream input = new ByteArrayInputStream(inputString.getBytes());
    setOut(new PrintStream(actual));
    setIn(input);
    main(new String[]{});

    String expected = "2\n"
        + "3";
    assertThat(actual.toString(), is(expected));
  }
}