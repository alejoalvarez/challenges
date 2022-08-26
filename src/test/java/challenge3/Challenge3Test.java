package challenge3;

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