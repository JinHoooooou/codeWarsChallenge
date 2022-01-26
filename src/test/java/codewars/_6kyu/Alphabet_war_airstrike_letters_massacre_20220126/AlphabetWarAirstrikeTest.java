package codewars._6kyu.Alphabet_war_airstrike_letters_massacre_20220126;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlphabetWarAirstrikeTest {

  @Test
  public void test1() {
    assertThat(AlphabetWarAirstrike.alphabetWar("z"), is("Right side wins!"));
  }

  @Test
  public void test2() {
    assertThat(AlphabetWarAirstrike.alphabetWar("z*dq*mw*pb*s"), is("Let's fight again!"));
  }

  @Test
  public void test3() {
    assertThat(AlphabetWarAirstrike.alphabetWar("z*z*z*zs"), is("Left side wins!"));
  }
}