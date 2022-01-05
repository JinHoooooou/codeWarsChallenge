package refactoring.after;

public class PrimeGenerator {

  public int[] generatePrimes(int numberOfPrimes) {
    int[] primes = new int[numberOfPrimes + 1];
    int primeIndex = 1;

    for (int candidate = 2; primeIndex < primes.length; candidate++) {
      if (isPrime(candidate)) {
        primes[primeIndex++] = candidate;
      }
    }
    return primes;
  }

  private boolean isPrime(int candidate) {
    for (int divisor = 2; divisor <= (int) Math.sqrt(candidate); divisor++) {
      if (candidate % divisor == 0) {
        return false;
      }
    }
    return true;
  }

}
