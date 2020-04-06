package ValidPhoneNumber_20200217;

import java.util.regex.Pattern;

public class Kata {

  public static boolean validPhoneNumber(String phoneNumber) {
        
       /* String splitNumber[] = phoneNumber.split(" ");
        if(splitNumber.length!=2)
            return false;
        if(splitNumber[0].length()!=5)
            return false;
        if(splitNumber[0].charAt(0) != '(' || splitNumber[0].charAt(4) != ')')
            return false;
        if(!splitNumber[0].subSequence(1, 3).toString().matches("^[0-9]+$"))
            return false;

        String moreSplitNumber[] = splitNumber[1].split("-");
        if(moreSplitNumber.length!=2)
            return false;
        if(moreSplitNumber[0].length()!=3)
            return false;
        if(!moreSplitNumber[0].matches("^[0-9]+$"))
            return false;
        if(moreSplitNumber[1].length()!=4)
            return false;
        if(!moreSplitNumber[1].matches("^[0-9]+$"))
            return false;

        return true;*/

    return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
  }
}
