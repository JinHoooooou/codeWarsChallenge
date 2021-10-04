package codeWars.kyu6.Loose_Changes_20211004;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ChangeTest {

  @Test
  @DisplayName("test should return Quarters=1, Nickels=0, Dimes=0, Pennies=4 When input is 29")
  public void test1() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Pennies", 4);
    map.put("Nickels", 0);
    map.put("Dimes", 0);
    map.put("Quarters", 1);
    assertThat(Change.looseChange(29), is(map));
  }

  @Test
  @DisplayName("test should return Quarters=0, Nickels=0, Dimes=0, Pennies=4 When input is 0")
  public void test2() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Pennies", 0);
    map.put("Nickels", 0);
    map.put("Dimes", 0);
    map.put("Quarters", 0);
    assertThat(Change.looseChange(0), is(map));
  }

  @Test
  @DisplayName("test should return Quarters=3, Nickels=1, Dimes=1, Pennies=1 When input is 91")
  public void test3() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Pennies", 1);
    map.put("Nickels", 1);
    map.put("Dimes", 1);
    map.put("Quarters", 3);
    assertThat(Change.looseChange(91), is(map));
  }

  @Test
  @DisplayName("test should return Quarters=0, Nickels=0, Dimes=0, Pennies=0 When input is -2")
  public void test4() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("Pennies", 0);
    map.put("Nickels", 0);
    map.put("Dimes", 0);
    map.put("Quarters", 0);
    assertThat(Change.looseChange(-2), is(map));
  }
}