package challenge2;

public class Challenge2Solution3 {

    public static String spinWords(String sentence){
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
