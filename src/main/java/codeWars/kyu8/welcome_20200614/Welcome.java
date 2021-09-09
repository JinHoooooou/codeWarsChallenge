package codeWars.kyu8.welcome_20200614;

import java.util.HashMap;
import java.util.Map;

public class Welcome {

  public static String greet(String language) {

    Map<String, String> greetMap = getGreetMap();
    return greetMap.getOrDefault(language, "Welcome");
  }

  private static Map<String, String> getGreetMap() {
    Map<String, String> result = new HashMap<>();
    result.put("english", "Welcome");
    result.put("czech", "Vitejte");
    result.put("danish", "Velkomst");
    result.put("dutch", "Welkom");
    result.put("estonian", "Tere tulemast");
    result.put("finnish", "Tervetuloa");
    result.put("flemish", "Welgekomen");
    result.put("french", "Bienvenue");
    result.put("german", "Willkommen");
    result.put("irish", "Failte");
    result.put("italian", "Benvenuto");
    result.put("latvian", "Gaidits");
    result.put("lithuanian", "Laukiamas");
    result.put("polish", "Witamy");
    result.put("spanish", "Bienvenido");
    result.put("swedish", "Valkommen");
    result.put("welsh", "Croeso");
    return result;
  }
}
