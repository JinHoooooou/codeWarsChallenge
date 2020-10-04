package codeWars.kyu8.MilesPerGallonToKilometersPerLiter_20201004;

public class Converter {

  private static final float GALLON_LITTER = 4.54609188f;
  private static final float MILE_KILOMETER = 1.609344f;

  public static float mpgToKPM(final float mpg) {
    float result = mpg * MILE_KILOMETER / GALLON_LITTER;
    String resultString = String.valueOf(result);
    resultString = resultString.substring(0, resultString.indexOf('.') + 4);

    return resultString.charAt(resultString.length() - 1) == '0'
        ? Float.valueOf(resultString.substring(0, resultString.length() - 1))
        : Float.valueOf(resultString);
  }
}
