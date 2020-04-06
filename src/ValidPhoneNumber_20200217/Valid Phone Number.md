## Valid Phone Number



전화번호 포맷이 (???) ???-????의형식이다.

처음에 정규식을 쓰면 된다고 생각했다.

그래서 우선 String을 " "으로 split하여 String length가 2가 아니면 false를 return하도록( (???)과 ???-????사이에 space가 있으니)했다.

String splitNumber[] = phoneNumber.split(" ");

그후에 splitNumber[0].matches()를 통해 정규식을 이용하려했는데

구글 검색을 해보니 특수문자는 \\(로 표현가능하다더라 그래서

splitNumber[0].mathces("^\\( [0-9] [0-9] [0-9] \\)$")로 했는데 안되더라.. 그래서 어쩔수없이 분기처리로 더럽게 해결했다.

if(splitNumber[0].length != 5) return false;

if(splitNumber[0].charAt(0)!='(' || splitNumber[0].charAt(4)!=')') return false

if(splitNumber.subSequence(1,3).toString().matches("^[0-9]+$")) return false

굉장히 더럽...

이걸보고 그냥 뒤의 문자열 ???-????도 같게 처리하자라고 생각해서

String moreSplitNumber[] = splitNumber[1].split("-");

if(moreSplitNumber[0].length != 3) return false;

if(moreSplitNumber[0].matches("^[0-9]+$")) return false;

if(moreSplitNumber[1].length != 5) return false;

if(moreSplitNumber[1].matches("^[0-9]+$")) return false;



return true;

진짜 딱 봐도 엄청 못풀었다.. 라고 느껴졌다.

답을보니



return phoneNumber.matehces("\\\\(\\\\d{3}\\\\) \\\\d{3}-\\\\d{5}"); 로 매우 간단하게 해결했다..

백슬래쉬가 2번 들어가야하는것도 알게되었고.. \\\\d가 숫자를 나타내며 {n}은 길이가 n만큼이라는것도 알게되었다..

정규식을 좀 공부할 필요를 또 느낌

