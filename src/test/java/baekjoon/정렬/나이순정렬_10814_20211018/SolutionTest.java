package baekjoon.정렬.나이순정렬_10814_20211018;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private ByteArrayInputStream in;
  private ByteArrayOutputStream out;

  @BeforeEach
  public void setUp() {
    out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
  }

  @AfterEach
  public void tearDown() {
    System.setIn(System.in);
    System.setOut(System.out);
  }

  @Test
  public void test1() throws IOException {
    String input = "8\n"
        + "21 Junkyu\n"
        + "21 Dohyun\n"
        + "20 Sunyoung\n"
        + "28 Jinho\n"
        + "28 Hama\n"
        + "26 SongMin\n"
        + "19 Oya\n"
        + "23 Junmo";

    in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Solution.main(new String[]{});

    String expectd = "19 Oya\n"
        + "20 Sunyoung\n"
        + "21 Junkyu\n"
        + "21 Dohyun\n"
        + "23 Junmo\n"
        + "26 SongMin\n"
        + "28 Jinho\n"
        + "28 Hama\n";
    assertThat(out.toString(), is(expectd));
  }


}