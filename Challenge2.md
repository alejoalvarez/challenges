Challenge 2: Stop gninnipS My sdroW!

# Description:

Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed.

- Strings passed in will consist of only letters and spaces.
- Spaces will be included only when more than one word is present.

**Examples:**

```java
spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
spinWords("This is a test") => "This is a test" 
spinWords("This is another test") => "This is rehtona test"
```

# Test cases
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
      assertEquals("Heys wollef sroirraw", new SpinWords().spinWords("Heys fellow warriors"));
    }
    
}
```

## Solution 1:

```java

import java.util.Arrays;
 
public class SpinWords {
 
  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
```

## Solution 2

```java
import java.util.stream.*;
import java.util.Arrays;
 
public class SpinWords {
 
  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}
```
