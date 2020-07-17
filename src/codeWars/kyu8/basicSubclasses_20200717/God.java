package codeWars.kyu8.basicSubclasses_20200717;

public class God {

  public static Human[] create() {
    return new Human[]{new Man(), new Woman()};
  }
}

interface Human {

}

class Man implements Human {

}

class Woman implements Human {

}