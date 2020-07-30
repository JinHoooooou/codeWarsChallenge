package codeWars.kyu8.grasshopper_20200730;

public class GrassHopper {

  public static String weatherInfo(double temp) {
    double c = convertToCelsius(temp);
    return c <= 0 ? c + " is freezing temperature" : c + " is above freezing temperature";
  }

  public static double convertToCelsius(double temperature) {
    return (temperature - 32) * 5 / 9;
  }
}
