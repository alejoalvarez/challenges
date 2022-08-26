Challenge 3: check if who words are anagrams

# Description:
An algorithm is required that validates if two words are anagrams

**Examples:**

- frase, fresa => true
- amor, romas => false
- Irónicamente, renacimiento => true

## Tests cases

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Challenge3Test {

    // Test solution 1
    @Test
    public void solution1Tests() {
        assertTrue(Challenge3Solution1.isAnagram("Conservadora", "conversadora"));
        assertTrue(Challenge3Solution1.isAnagram("Irónicamente", "renacimiento"));
        assertTrue(Challenge3Solution1.isAnagram("Escandalizar", "zascandilear"));
        assertTrue(Challenge3Solution1.isAnagram("Frase", "fresa"));
        assertTrue(Challenge3Solution1.isAnagram("Cárro", "corra"));
        assertFalse(Challenge3Solution1.isAnagram("hola", "holas"));
        assertTrue(Challenge3Solution1.isAnagram("hola1", "h1ola"));
        assertTrue(Challenge3Solution1.isAnagram("hola11", "h1ola 1"));
        assertFalse(Challenge3Solution1.isAnagram("hola", "holas"));
    }
}
```

## Solution 1
```java
import java.util.Arrays;

public class Challenge3Solution1 {

    public static boolean isAnagram(String word1, String word2){
        String[] result = convertToLowerCase(removeSpecialCharacters(word1, word2));
        for(int i = 0; i< result.length ; i++){
            result[i] = sortString(result[i]);
        }
        return result[0].equals(result[1]);
    }

    private static String[] removeSpecialCharacters(String word1, String word2){
        var result = new String[2];
        result[0] = word1;
        result[1] = word2;
        for(int i = 0; i< result.length; i++){
            result[i] = result[i].replace(" ", "")
                    .replace(",","")
                    .replace("á","a")
                    .replace("é","e")
                    .replace("í","i")
                    .replace("ó","o")
                    .replace("ú","u");
        }
        return result;
    }

    private static String[] convertToLowerCase(String[] words){
        for (int i = 0; i < words.length ; i++){
            words[i] = words[i].toLowerCase();
        }
        return words;
    }

    private static String sortString(String word){
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
```

