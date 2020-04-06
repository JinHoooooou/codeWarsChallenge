package complementaryDNA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DnaStrandTest {
  @Test
  public void testWhenParameterHasOnlyA() {
    //Given
    String given = "AAAA";
    //When
    String actual = DnaStrand.makeComplement(given);
    //Then
    assertEquals("TTTT",actual);
  }

  @Test
  public void testWhenParameterHasAAndC() {
    //Given
    String given = "AACC";
    //When
    String actual = DnaStrand.makeComplement(given);
    //Then
    assertEquals("TTGG",actual);
  }

  @Test
  public void testWhenParameterHasAAndT() {
    //Given
    String given = "ATATA";
    //When
    String actual = DnaStrand.makeComplement(given);
    //Then
    assertEquals("TATAT",actual);
  }

  @Test
  public void testWhenParameterHasATCG() {
    //Given
    String given = "ATCGTAGC";
    //When
    String actual = DnaStrand.makeComplement(given);
    //Then
    assertEquals("TAGCATCG",actual);
  }


}