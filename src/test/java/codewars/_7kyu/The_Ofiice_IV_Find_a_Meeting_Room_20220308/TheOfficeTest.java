package codewars._7kyu.The_Ofiice_IV_Find_a_Meeting_Room_20220308;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TheOfficeTest {

  @Test
  public void test1() {
    char[] input = {'X', 'O', 'X'};
    Object expected = 1;
    assertThat(TheOffice.meeting(input), is(expected));
  }

  @Test
  public void test2() {
    char[] input = {'O', 'X', 'X', 'X', 'X'};
    Object expected = 0;
    assertThat(TheOffice.meeting(input), is(expected));
  }

  @Test
  public void test3() {
    char[] input = {'X', 'X', 'O', 'X', 'X'};
    Object expected = 2;
    assertThat(TheOffice.meeting(input), is(expected));
  }

  @Test
  public void test4() {
    char[] input = {'X', 'X', 'X', 'X', 'X'};
    Object expected = "None available!";
    assertThat(TheOffice.meeting(input), is(expected));
  }
}