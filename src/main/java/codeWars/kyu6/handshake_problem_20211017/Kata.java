package codeWars.kyu6.handshake_problem_20211017;

public class Kata {

  public static int GetParticipants(int handshakes) {
    return (int) Math.ceil((1 + Math.sqrt(1 + (4 * handshakes * 2))) / 2.0);
  }
}
