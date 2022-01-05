package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DollarFrancTest {

  @Test
  @Order(1)
  public void testDollarMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  @Order(2)
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  @Order(3)
  public void testAmountEquality() {
    assertEquals(Money.dollar(5), Money.dollar(5));
    assertNotEquals(Money.dollar(5), Money.dollar(6));
    assertNotEquals(Money.dollar(5), Money.franc(5));
  }

  @Test
  @Order(4)
  public void testSimpleAddition() {
    Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
    Bank bank = new Bank();
    Money reduced = bank.change(sum, "USD");
    assertEquals(Money.dollar(7), reduced);
  }

  @Test
  @Order(5)
  public void testReduceMoney() {
    Bank bank = new Bank();
    Money result = bank.change(Money.dollar(1), "USD");
    assertEquals(Money.dollar(1), result);
  }

  @Test
  public void testEmptyString() {
    String binary = Integer.toBinaryString(54656);
    System.out.println(binary);
    System.out.println(Integer.parseInt(binary, 2));
  }
}
