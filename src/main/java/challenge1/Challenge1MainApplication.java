package challenge1;

import java.util.Random;
import java.util.stream.IntStream;

public class Challenge1MainApplication {

    public static void main (String[] args){
        System.out.println("Response with solution 1: " + Challenge1Solution1.createPhoneNumber(randomInput()));
        System.out.println("Response with solution 2: " + Challenge1Solution2.createPhoneNumber(randomInput()));
        System.out.println("Response with solution 3: " + Challenge1Solution3.createPhoneNumber(randomInput()));
        System.out.println("Response with solution 4: " + Challenge1Solution4.createPhoneNumber(randomInput()));
        System.out.println("Response with solution 5: " + Challenge1Solution5.createPhoneNumber(randomInput()));
    }

    /**
     * This method generate a random input
     * @return array with input generated
     */
    public static int[] randomInput() {
        Random r = new Random();
        int[] result = null;
        for (int i = 0; i < 100; i++) {
            result = IntStream.range(0, 10)
                    .map(x -> r.nextInt(10))
                    .toArray();
        };
        return result;
    }
}