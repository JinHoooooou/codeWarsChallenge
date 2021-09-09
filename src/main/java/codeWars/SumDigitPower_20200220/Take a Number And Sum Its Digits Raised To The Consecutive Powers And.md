#### Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!



* Instruction

  1 == 1^1

  2 == 2^1

  10 != 1^1 + 0^2

  89 == 8^1 + 9^2

  135 == 1^1 + 3^2 + 5^3

  범위 a - to - b까지 주어졌을때 그 사이의 저런 숫자들의 배열을 반환하는 함수작성



#### Test 1. 0 ~ 0이면 {0}을 반환

```java
public class SumDigPower{
    public static List<Long> sumDigPow(long a, long b){
        List<Long> resultContainer = new ArrayList<>();
        resultContainer.add(0);
        
        return resultContainer;
    }
}
```



#### Test 2. 0 ~ 1 이면 {0,1}을 반환

```java
public class SumDigPower{
    public static List<Long> sumDigPow(long a, long b){
        List<Long> resultContainer = new ArrayList<>();
        resultContainer.add(0);
        resultContainer.add(1);
        
        return resultContainer;
    }
}
```



#### Test 3. 0~9 이면 {0,1,2,3,4,5,6,7,8,9} 반환

```java
public class SumDigPower{
    public static List<Long> sumDigPow(long a, long b){
        List<Long> resultContainer = new ArrayList<>();
        for(int target = a; target<=b; target++)
            resultContainer.add(i);
        
        return resultContainer;
    }
}
```

그냥 loop로 처리해도 되겠다 생각



#### Test 4. 0~10이면 {0,1,2,3,4,5,6,7,8,9} 반환

여기서 든 생각. 10은 반환 배열에 포함되면안되니까 if문으로 어떤 처리를 해줘야할거같다. 그래서 target을 0이 될때까지 나누어서 나머지들을 저장하고 나머지들로 inst에서 소개된 방법으로 계산하고 target과 값이 같으면 저장한다 생각

```java
public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b){
        List<Long> reminderContainer = new ArrayList<Long>();
        List<Long> resultContainer = new ArrayList<Long>();
        long sumOfDigPower = 0;
        for(long i = a; i<=b; i++) {
            long number = i;
            while (number != 0) {
                long reminder = number % 10;
                reminderContainer.add(0, reminder);
                number = number / 10;
            }
            for (int j = 0; j < reminderContainer.size(); j++) {
                sumOfDigPower += Math.pow((long) reminderContainer.get(j), j + 1);
            }
            if (sumOfDigPower == i) resultContainer.add(Long.valueOf(sumOfDigPower));
            reminderContainer.clear();
            sumOfDigPower = 0;
        }

        return resultContainer;
    }
}
```

테스트 모두 통과



#### 리팩토링

for문 안의 코드들을 함수로 따로 빼면 더 깔끔하지 않을까 생각 i대신 target사용

```java
public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b){
        List<Long> reminderContainer = new ArrayList<Long>();
        List<Long> resultContainer = new ArrayList<Long>();
        long sumOfDigPower = 0;

        for(long target = a; target <= b; target++){
            if(target == checkEureka(target))
                resultContainer.add(target);
        }
        return resultContainer;
    }

    private static long checkEureka(long target) {
        List<Long> reminderContainer = new ArrayList<>();
        long sumOfDigPower = 0;
        while(target > 0){
                     reminderContainer.add(0, target % 10);
                     target /= 10;
                 }
         
                 for(int i = 0; i< reminderContainer.size(); i++){
                     sumOfDigPower += Math.pow(reminderContainer.get(i), i+1);
                 }
        return sumOfDigPower;
    }
}
```

여기서 checkEureka메소드를 더 줄일수없을까

```java
public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b){
        List<Long> reminderContainer = new ArrayList<Long>();
        List<Long> resultContainer = new ArrayList<Long>();
        long sumOfDigPower = 0;

        for(long target = a; target <= b; target++){
            if(target == checkEureka(target))
                resultContainer.add(target);
        }
        return resultContainer;
    }

    private static long checkEureka(long target) {
        String longToString = String.valueOf(target);
        long sumOfDigPow = 0;
        for(int i = 0; i<longToString.length(); i++){
            //longToString.charAt(i);
            //Long.parseLong(longToString.charAt(i));
            //Long.parseLong(String.valueOf(longToString.charAt(i)));
            //Math.pow(Long.parseLong(String.valueOf(longToString.charAt(i)),i+1))
            sumOfDigPow +=
            Math.pow(Long.parseLong(String.valueOf(longToString.charAt(i)),i+1));
        }
        return sumOfDigPower;
    }
}
```

