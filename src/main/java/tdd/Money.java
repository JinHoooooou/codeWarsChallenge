package tdd;

class Money implements Expression {

  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public String currency() {
    return this.currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public Money reduce(String to) {
    return this;
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && currency().equals(money.currency());
  }

  public String toString() {
    return amount + "    " + currency;
  }
}
