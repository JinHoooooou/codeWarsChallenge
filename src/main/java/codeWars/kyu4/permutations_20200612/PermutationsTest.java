package codeWars.kyu4.permutations_20200612;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PermutationsTest {

  @Test
  @DisplayName("test should return [abc, acb, bac, bca, cab, cba] when input abc")
  public void test1() {

    // When: Call singlePermutations method
    List<String> actual = Permutations.singlePermutations("abc");

    // Then: Should return [abc, acb, bac, bca, cab, cba]
    assertEquals(new ArrayList<String>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")),
        actual.stream().sorted().collect(Collectors.toList()));
  }

  @Test
  @DisplayName("test should return [ab, ba] when input ab")
  public void test2() {

    // When: Call singlePermutations method
    List<String> actual = Permutations.singlePermutations("ab");

    // Then: Should return [ab,ba]
    assertEquals(new ArrayList<String>(Arrays.asList("ab", "ba")),
        actual.stream().sorted().collect(Collectors.toList()));
  }
}