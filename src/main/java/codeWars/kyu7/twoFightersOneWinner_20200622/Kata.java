package codeWars.kyu7.twoFightersOneWinner_20200622;

public class Kata {

  public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter first = fighter1;
    Fighter second = fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      first = fighter2;
      second = fighter1;
    }
    while (true) {
      second.health -= first.damagePerAttack;
      if (second.health <= 0) {
        return first.name;
      }
      first.health -= second.damagePerAttack;
      if (first.health <= 0) {
        return second.name;
      }
    }
  }
}

class Fighter {

  public String name;
  public int health;
  public int damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

}