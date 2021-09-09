package codeWars.findTheUniqueNumber_20200424;

public class Kata {

  public static double findUniq(double[] arr) {
    if (arr[0] != arr[1] && arr[0] != arr[2]) {
      return arr[0];
    }
    for (int i = 1; i < arr.length; i++) {
      if (arr[0] != arr[i]) {
        return arr[i];
      }
    }
    return 0;

    // Best Practice
//    Arrays.sort(arr);
//    return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
  }
}
