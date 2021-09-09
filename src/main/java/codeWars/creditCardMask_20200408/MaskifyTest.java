package codeWars.creditCardMask_20200408;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaskifyTest {

  @Test
  public void testShouldReturnOriginalStringWhenInputLengthLessThan4() {
    // Given: Set string length less than 4
    String given = "asd";
    // When: Call maskify method
    String actual = Maskify.maskify(given);
    // Then: Should return input string
    assertEquals(given, actual);
  }

  @Test
  public void testShouldReplaceAllCharacterToHashTagExceptLast4Characters() {
    // Given: Set string length more than 4
    String given = "mynameisleejinho";
    // When: Call maskify method
    String actual = Maskify.maskify(given);
    // Then: Should return Replace # except last 4 string
    assertEquals("############inho", actual);
  }

  @Test
  public void testShouldReturnLast4StringAlthoughStringHasSpace() {
    // Given: Set string length more than 4
    String given = "mynameisleeji nho";
    // When: Call maskify method
    String actual = Maskify.maskify(given);
    // Then: Should return Replace # except last 4 string
    assertEquals("############# nho", actual);
  }


}