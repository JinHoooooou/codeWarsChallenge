package baekjoon.mst.복제로봇_20220120;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

  OutputStream outputStream;
  InputStream inputStream;

  @BeforeEach
  public void setUp() {
    outputStream = new ByteOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(System.out);
    System.setIn(System.in);
  }


  @Test
  public void test1() throws IOException {
    String input = "5 2\n"
        + "11111\n"
        + "1S001\n"
        + "10001\n"
        + "1K1K1\n"
        + "11111";

    inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    Main.main(new String[]{});

    assertThat(outputStream.toString().trim(), is("6"));
  }

  @Test
  public void test2() throws IOException {
    String input = "4 1\n"
        + "1111\n"
        + "1S11\n"
        + "11K1\n"
        + "1111";

    inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    Main.main(new String[]{});

    assertThat(outputStream.toString().trim(), is("-1"));
  }


}