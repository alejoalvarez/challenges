import challenge1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import java.util.stream.*;

public class Challenge1Test {

    // Test solution 1
    @Test
    public void solution1BasicTests() {
        assertEquals("(123) 456-7890", Challenge1Solution1.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Challenge1Solution1.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Challenge1Solution1.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Challenge1Solution1.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    // Test solution 1
    @Test
    public void solution1RandomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Challenge1Solution1.createPhoneNumber(a));
        }
    }

    // Test solution 2
    @Test
    public void solution2BasicTests() {
        assertEquals("(123) 456-7890", Challenge1Solution2.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Challenge1Solution2.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Challenge1Solution2.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Challenge1Solution2.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    // Test solution 2
    @Test
    public void solution2RandomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Challenge1Solution2.createPhoneNumber(a));
        }
    }

    // Test solution 3
    @Test
    public void solution3BasicTests() {
        assertEquals("(123) 456-7890", Challenge1Solution3.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Challenge1Solution3.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Challenge1Solution3.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Challenge1Solution3.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    // Test solution 3
    @Test
    public void solution3RandomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Challenge1Solution3.createPhoneNumber(a));
        }
    }

    // Test solution 4
    @Test
    public void solution4BasicTests() {
        assertEquals("(123) 456-7890", Challenge1Solution4.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Challenge1Solution4.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Challenge1Solution4.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Challenge1Solution4.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    // Test solution 4
    @Test
    public void solution4RandomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Challenge1Solution4.createPhoneNumber(a));
        }
    }

    // Test solution 5
    @Test
    public void solution5BasicTests() {
        assertEquals("(123) 456-7890", Challenge1Solution5.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        assertEquals("(111) 111-1111", Challenge1Solution5.createPhoneNumber(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals("(478) 157-9971", Challenge1Solution5.createPhoneNumber(new int[] {4, 7, 8, 1, 5, 7, 9, 9, 7, 1}));
        assertEquals("(780) 221-7513", Challenge1Solution5.createPhoneNumber(new int[] {7, 8, 0, 2, 2, 1, 7, 5, 1, 3}));
    }

    // Test solution 5
    @Test
    public void solution5RandomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int[] a = IntStream.range(0, 10).map(x -> r.nextInt(10)).toArray();
            assertEquals(sol(a), Challenge1Solution5.createPhoneNumber(a));
        }
    }

    private String sol(int[] numbers) {
        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
}
