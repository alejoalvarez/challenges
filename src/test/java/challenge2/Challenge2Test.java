package challenge2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Challenge2Test {

    // Test solution 1
    @Test
    public void solution1Tests() {
        assertEquals("emocleW", Challenge2Solution1.spinWords("Welcome"));
        assertEquals("emocleW", Challenge2Solution1.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", Challenge2Solution1.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", Challenge2Solution1.spinWords("This is a test"));
        assertEquals("This is rehtona test", Challenge2Solution1.spinWords("This is another test"));
        assertEquals("This ecnetnes is a ecnetnes", Challenge2Solution1.spinWords("This sentence is a sentence"));
        assertEquals("You are tsomla to the last test", Challenge2Solution1.spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", Challenge2Solution1.spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", Challenge2Solution1.spinWords("Seriously this is the last one"));
    }

    // Test solution 2
    @Test
    public void solution2Tests() {
        assertEquals("emocleW", Challenge2Solution2.spinWords("Welcome"));
        assertEquals("emocleW", Challenge2Solution2.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", Challenge2Solution2.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", Challenge2Solution2.spinWords("This is a test"));
        assertEquals("This is rehtona test", Challenge2Solution2.spinWords("This is another test"));
        assertEquals("This ecnetnes is a ecnetnes", Challenge2Solution2.spinWords("This sentence is a sentence"));
        assertEquals("You are tsomla to the last test", Challenge2Solution2.spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", Challenge2Solution2.spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", Challenge2Solution2.spinWords("Seriously this is the last one"));
    }

    // Test solution 3
    @Test
    public void solution3Tests() {
        assertEquals("emocleW", Challenge2Solution3.spinWords("Welcome"));
        assertEquals("emocleW", Challenge2Solution3.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", Challenge2Solution3.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", Challenge2Solution3.spinWords("This is a test"));
        assertEquals("This is rehtona test", Challenge2Solution3.spinWords("This is another test"));
        assertEquals("This ecnetnes is a ecnetnes", Challenge2Solution3.spinWords("This sentence is a sentence"));
        assertEquals("You are tsomla to the last test", Challenge2Solution3.spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", Challenge2Solution3.spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", Challenge2Solution3.spinWords("Seriously this is the last one"));
    }
}