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

