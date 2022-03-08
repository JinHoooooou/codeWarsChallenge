package codewars._7kyu.The_Ofiice_IV_Find_a_Meeting_Room_20220308;

public class TheOffice {

  public static Object meeting(char[] x) {
    for (int i = 0; i < x.length; i++) {
      if (x[i] == 'O') {
        return i;
      }
    }
    return "None available!";
  }
}
