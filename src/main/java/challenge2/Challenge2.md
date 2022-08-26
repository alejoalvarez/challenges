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
      assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
      assertEquals("This is rehtona test", new SpinWords().spinWords("This is another test"));
      assertEquals("This ecnetnes is a ecnetnes", new SpinWords().spinWords("This sentence is a sentence"));
      assertEquals("You are tsomla to the last test", new SpinWords().spinWords("You are almost to the last test"));
      assertEquals("Just gniddik ereht is llits one more", new SpinWords().spinWords("Just kidding there is still one more"));
      assertEquals("ylsuoireS this is the last one", new SpinWords().spinWords("Seriously this is the last one"));
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

## Solution 3

```java
public class SpinWords {

  public String spinWords(String sentence) {
    
       for (String a : sentence.split(" "))
       {
           if (a.length()> 4)
           {
              sentence = sentence.replace(a, new  StringBuffer(a).reverse());
           }
       }
       return sentence;
  }
}
```
