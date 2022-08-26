package challenge2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenge2Solution2 {

    public static String spinWords(String sentence){
        return Arrays.stream(sentence.split(" "))
                .map(item -> item.length() > 4 ?
                        new StringBuilder(item).reverse().toString() : item)
                .collect(Collectors.joining(" "));
    }
}
