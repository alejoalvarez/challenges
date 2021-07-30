Challenge 3: Validar si dos palabra son anagramas

# Description:
Se requiere realizar un algoritmoq que valide si dos palabras son anagramas 

**Examples:**

- frase, fresa => true
- amor, romas => false
- Irónicamente, renacimiento => true

## Tests cases

```java
import com.co.main.MainApplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class test1 {

    @Test
    public void tests() {
        assertEquals(true, MainApplication.isAnagram("Conservadora","conversadora"));
        assertEquals(true, MainApplication.isAnagram("Irónicamente","renacimiento"));
        assertEquals(true, MainApplication.isAnagram("Escandalizar","zascandilear"));
        assertEquals(true, MainApplication.isAnagram("Frase","fresa"));
        assertEquals(true, MainApplication.isAnagram("Cárro","corra"));
        assertEquals(false, MainApplication.isAnagram("hola","holas"));
        assertEquals(true, MainApplication.isAnagram("hola1","h1ola"));
        assertEquals(true, MainApplication.isAnagram("hola11","h1ola 1"));
        assertEquals(false, MainApplication.isAnagram("hola","holas"));
    }
}
```

## Solution 1
```java
package com.co.main;

import java.util.Arrays;

public class MainApplication {

   /* public static void main(String[] args) {

        String [] words = new String[]{"amor", "roma"};

        boolean result = isAnagram(words[0], words[1]);
        System.out.println(String.format("The %s y %s are anagrams? = %s", words[0], words[1], result ));
    }*/

    public static boolean isAnagram(String word1, String word2){
        String[] result = convertUpperCaseAndRemoveSpecialCharacters(word1, word2);
        result[0] =  sortString(result[0]);
        result[1] = sortString(result[1]);
        return result[0].equals(result[1]);
    }

    private static String[] convertUpperCaseAndRemoveSpecialCharacters(String word1, String word2){
        var result = new String [2];
        result[0] = word1.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a")
                .replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        result[1] = word2.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a")
                .replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        return  result;
    }

    private static String sortString(String word){
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}

