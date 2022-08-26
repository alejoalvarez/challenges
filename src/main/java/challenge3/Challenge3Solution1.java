package challenge3;

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
