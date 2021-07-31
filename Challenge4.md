Challenge 4: Validar si dos palabra son anagramas

# Description:
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

**Examples:**:
- Input: 42145 => Output: 54421

- Input: 145263 => Output: 654321

- Input: 123456789 => Output: 987654321

## Tests cases

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, DescendingOrder.sortDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(123495678));
    }
}
```

## Solution 1
```java
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}
```

## Solution 2

```java
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
```

## Solution 3
```java
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
  
    if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

    String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);
    
    String result = "";
    
    for(String s : numbers)
    {
      result = s + result;
    }
    
    return Integer.parseInt(result);
  }
}
```
