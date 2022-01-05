package codeWars.kyu4.recoverSecretStringFromRandomTriplets_20200802;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SecretDetectiveTest {

  SecretDetective detective = new SecretDetective();

  @Test
  public void test1() {
    // Given: Set input
    char[][] triplets = {
        {'t', 'u', 'p'},
        {'w', 'h', 'i'},
        {'t', 's', 'u'},
        {'a', 't', 's'},
        {'h', 'a', 'p'},
        {'t', 'i', 's'},
        {'w', 'h', 's'}
    };

    assertEquals("whatisup", detective.recoverSecret(triplets));
  }

  @Test
  public void test2() {
    // Given: Set input
    char[][] triplets = {
        {'t', 's', 'f'},
        {'a', 's', 'u'},
        {'m', 'a', 'f'},
        {'a', 'i', 'n'},
        {'s', 'u', 'n'},
        {'m', 'f', 'u'},
        {'a', 't', 'h'},
        {'t', 'h', 'i'},
        {'h', 'i', 'f'},
        {'m', 'h', 'f'},
        {'a', 'u', 'n'},
        {'m', 'a', 't'},
        {'f', 'u', 'n'},
        {'h', 's', 'n'},
        {'a', 'i', 's'},
        {'m', 's', 'n'},
        {'m', 's', 'u'}
    };

    assertEquals("mathisfun", detective.recoverSecret(triplets));
  }
}