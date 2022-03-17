package codewars._7kyu.Double_Sort_20220317;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoubleSortTest {

  @Test
  @DisplayName("test should return ascending sorted array when input is only numbers")
  public void test1() {
    Object[] input = {6, 2, 3, 4, 5};
    Object[] expected = {2, 3, 4, 5, 6};

    assertThat(DoubleSort.dbSort(input), is(expected));
  }

  @Test
  @DisplayName("test should return ascending sorted array when input is only strings")
  public void test2() {
    Object[] input = {"Banana", "Orange", "Apple", "Mango"};
    Object[] expected = {"Apple", "Banana", "Mango", "Orange"};

    assertThat(DoubleSort.dbSort(input), is(expected));
  }

  @Test
  @DisplayName("test should return first numbers and seconds strings")
  public void test3() {
    Object[] input = {"Banana", "Orange", "Apple", "Mango", 0, 2, 2};
    Object[] expected = {0, 2, 2, "Apple", "Banana", "Mango", "Orange"};

    assertThat(DoubleSort.dbSort(input), is(expected));
  }
}