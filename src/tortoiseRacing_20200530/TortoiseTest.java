package tortoiseRacing_20200530;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TortoiseTest {

  @Test
  @DisplayName("test should null when v1>=v2")
  public void test1() {
    // Then: Should return null
    assertNull(Tortoise.race(100,80,40));
  }
}