package codeWars.kyu6.mexicanWave_20200603;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MexicanWave {

  public static String[] wave(String str) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
    }
    return result.stream().filter(x -> !x.equals(str)).toArray(String[]::new);
  }

  @Test
  public void test1() {
    // Then: Should return [Hello, hEllo, heLlo, helLo, hellO]
    assertArrayEquals(new String[]{"Hello", "hEllo", "heLlo", "helLo", "hellO"}, wave("hello"));
  }

  @Test
  public void test2() {
    // Then: Should return [Hello, hEllo, heLlo, helLo, hellO]
    assertArrayEquals(
        new String[]{"Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
            "two worDs", "two wordS"}, wave("two words"));
  }
}
