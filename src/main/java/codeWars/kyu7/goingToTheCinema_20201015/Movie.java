package codeWars.kyu7.goingToTheCinema_20201015;

public class Movie {

  public static int movie(int card, int ticket, double perc) {

    int systemA = ticket;
    double systemB = card;
    int times = 1;

    while (true) {
      systemA = ticket * times;
      systemB = systemB + (ticket * Math.pow(perc, times));
      if (Math.ceil(systemB) < systemA) {
        break;
      }
      times++;
    }
    return times;
  }
}
