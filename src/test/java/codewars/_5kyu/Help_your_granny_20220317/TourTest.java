package codewars._5kyu.Help_your_granny_20220317;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class TourTest {

  @Test
  public void test1() {
    String[] arrFriends = {"A1", "A2", "A3", "A4", "A5"};
    String[][] ftwns = {
        {"A1", "X1"},
        {"A2", "X2"},
        {"A3", "X3"},
        {"A4", "X4"},
    };
    Map<String, Double> h = new HashMap<>();
    h.put("X1", 100.0);
    h.put("X2", 200.0);
    h.put("X3", 250.0);
    h.put("X4", 300.0);

    assertThat(Tour.tour(arrFriends, ftwns, h), is(889));
  }
}