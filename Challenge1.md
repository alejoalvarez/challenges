Challenge 1: Create phone number format

# Description:

Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

**Example:**
```java
MainApplication.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
```

The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!


# Test cases
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.util.stream.*;

public class PhoneTests {
  @Test
  public void basicTests() {
    assertEquals("(123) 456-7890", MainApplication.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    assertEquals("(111) 111-1111", MainApplication.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    assertEquals("(478) 157-9971", MainApplication.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
    assertEquals("(780) 221-7513", MainApplication.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
  }
  
  private String sol(int[] numbers) {
    return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
  }
  
  @Test
  public void randomTests() {
    Random r = new Random();
    for (int i = 0; i < 100; i++) {
      int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
      assertEquals(sol(a), MainApplication.createPhoneNumber(a));
    }
  }
}
```
## Solution 1

```java
public class MainApplication {
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }
}
```

## Solution 2

```java
import java.util.stream.IntStream;

public class MainApplication {
  public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());

  }
}
```

## Solution 3

```java
public class MainApplication {
  public static String createPhoneNumber(int[] numbers) {
    String phoneNumber = new String("(xxx) xxx-xxxx");
    
    for (int i : numbers) {
      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    }
    
    return phoneNumber;
  }
}
```

## Solution 4
```java
import java.util.Arrays;

public class MainApplication {

    private static String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";

    public static String createPhoneNumber(int[] numbers) {
        Integer[] numbersInt = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        return String.format(PHONE_FORMAT, numbersInt);
    }
}
```

## Solution 5

```java
public class MainApplication {
  public static String createPhoneNumber(final int[] n) {
    return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
  }
}
```

## Solution 6
```java
public class MainApplication {
   public static String createPhoneNumber(int[] numbers) {

      String result = "";
      for (int i = 0; i < numbers.length; i++) {
          if (i == 0)
              result += '(';
          else if (i == 3)
              result += ") ";
          else if (i == 6)
              result += '-';
          result += numbers[i];
      }
      return result;
    }
}
```
