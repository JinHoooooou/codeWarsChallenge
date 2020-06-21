package codeWars.kyu5.paginationHelper_20200621;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PaginationHelperTest {

  PaginationHelper<Character> helper;

  @BeforeEach
  public void setUp() {
    helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'r', 'a'), 4);
  }

  @Test
  public void testPageCountMethod() {

    // Then: Should return 2
    assertEquals(2, helper.pageCount());
  }

  @Test
  public void testItemCountMethod() {

    // Then: Should return 6
    assertEquals(8, helper.itemCount());
  }

  @Test
  public void testPageItemCountMethod() {

    assertEquals(4, helper.pageItemCount(0));
    assertEquals(4, helper.pageItemCount(1));
    assertEquals(-1, helper.pageItemCount(2));
    assertEquals(-1, helper.pageItemCount(3));
  }

  @Test
  public void testPageIndexMethod() {

    assertEquals(0, helper.pageIndex(0));
    assertEquals(0, helper.pageIndex(1));
    assertEquals(0, helper.pageIndex(2));
    assertEquals(0, helper.pageIndex(3));
    assertEquals(1, helper.pageIndex(4));
    assertEquals(1, helper.pageIndex(5));
    assertEquals(1, helper.pageIndex(6));
    assertEquals(1, helper.pageIndex(7));
    assertEquals(-1, helper.pageIndex(8));
  }
}