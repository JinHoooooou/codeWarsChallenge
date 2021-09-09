package codeWars.numberOfPeopleInBus_20200420;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MetroTest {

  @Test
  public void testShouldReturn0WhenBusIsEmpty() {
    // Given: Set get in, and get out people 0
    ArrayList<int[]> inAndOutPeopleList = new ArrayList<>();
    inAndOutPeopleList.add(new int[]{0, 0});
    // When: Call countPassengers method
    int actual = Metro.countPassengers(inAndOutPeopleList);
    // Then: Should return 0
    assertEquals(0, actual);
  }

  @Test
  public void testShouldReturn10WhenPeopleGetInBus10AndOff0() {
    // Given: Set first stop : get in, get out people 0
    // Given: Set second stop : get in 10, get out 0
    ArrayList<int[]> inAndOutPeopleList = new ArrayList<>();
    inAndOutPeopleList.add(new int[]{0, 0});
    inAndOutPeopleList.add(new int[]{10, 0});
    // When: Call countPassengers method
    int actual = Metro.countPassengers(inAndOutPeopleList);
    // Then: Should return 10
    assertEquals(10, actual);
  }

  @Test
  public void testShouldReturn8WhenBusStopsAtThirdStation() {
    // Given: Set first stop : get in, get out people 0
    //        Set second stop : get in 10, get out 0
    //        Set third stop : get in 3, get out 5
    ArrayList<int[]> inAndOutPeopleList = new ArrayList<>();
    inAndOutPeopleList.add(new int[]{0, 0});
    inAndOutPeopleList.add(new int[]{10, 0});
    inAndOutPeopleList.add(new int[]{3,5});
    // When: Call countPassengers method
    int actual = Metro.countPassengers(inAndOutPeopleList);
    // Then: Should return 8
    assertEquals(8, actual);
  }
}