package challenge1;

import java.util.stream.IntStream;

public class Challenge1Solution2 {

    public static String createPhoneNumber(int[] numbers){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                IntStream.of(numbers)
                            .boxed()
                            .toArray());
    }
}
