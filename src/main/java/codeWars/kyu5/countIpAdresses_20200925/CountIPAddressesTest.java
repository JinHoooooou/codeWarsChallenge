package codeWars.kyu5.countIpAdresses_20200925;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountIPAddressesTest {

  @Test
  public void testShouldReturn50() {
    String start = "10.0.0.50";
    String end = "10.0.0.0";
    assertEquals(50, CountIPAddresses.ipsBetween(start, end));
  }
}