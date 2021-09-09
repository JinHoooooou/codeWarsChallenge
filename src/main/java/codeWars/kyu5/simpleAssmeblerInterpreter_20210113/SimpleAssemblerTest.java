package codeWars.kyu5.simpleAssmeblerInterpreter_20210113;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class SimpleAssemblerTest {

  @Test
  public void test1() {
    String[] programs = new String[]{"mov a 5", "inc a", "dec a", "dec a", "jnz a -1", "inc a"};
    Map<String, Integer> out = new HashMap<>();
    out.put("a", 1);
    assertThat(SimpleAssembler.interpret(programs), is(out));
  }

  @Test
  public void test2() {
    String[] programs = new String[]{"mov a -10", "mov b a", "inc a", "dec b", "jnz a -2"};
    Map<String, Integer> out = new HashMap<>();
    out.put("a", 0);
    out.put("b", -20);
    assertThat(SimpleAssembler.interpret(programs), is(out));
  }

  @Test
  public void testComplexPrograms() {
    String[] programs = new String[]{
        "mov a 1",
        "mov b 1",
        "mov c 0",
        "mov d 26",
        "jnz c 2",
        "jnz 1 5",
        "mov c 7",
        "inc d",
        "dec c",
        "jnz c -2",
        "mov c a",
        "inc a",
        "dec b",
        "jnz b -2",
        "mov b c",
        "dec d",
        "jnz d -6",
        "mov c 18",
        "mov d 11",
        "inc a",
        "dec d",
        "jnz d -2",
        "dec c",
        "jnz c -5",
    };
    Map<String, Integer> out = new HashMap<>();
    out.put("a", 0);
    out.put("b", -20);
    assertThat(SimpleAssembler.interpret(programs), is(out));
  }
}