package codeWars.kyu7.myLanguages_20201210;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class MyLanguagesTest {

  @Test
  public void test1() {
    final Map<String, Integer> map = new HashMap<>();
    map.put("Java", 10);
    map.put("Ruby", 80);
    map.put("Python", 65);
    assertThat(MyLanguages.myLanguages(map), is(Arrays.asList("Ruby", "Python")));
  }
}