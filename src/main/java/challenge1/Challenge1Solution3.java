package challenge1;

public class Challenge1Solution3 {

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = new String("(XXX) XXX-XXXX");

        for(int i: numbers){
            phoneNumber = phoneNumber.replaceFirst("X",Integer.toString(i));
        };
        return phoneNumber;
    }
}
