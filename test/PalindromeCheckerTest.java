import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    PalindromeChecker testObj;

    @BeforeEach
    void setUp() {
        testObj = new PalindromeChecker();
    }

    @Test
    public void testCreatePalindromeObject() throws Exception {

        assertNotNull(testObj);
    }

    @Test
    public void testSimplePalindromeMethod_YesPalindrome() throws Exception {
        assertTrue(testObj.isPalindrome("MOM"));
    }

    @Test
    public void testSimplePalindrome_NotAPalindrome() throws Exception {
        assertFalse(testObj.isPalindrome("Blah"));
    }

    @Test
    public void testSimplePalindromeMethod_NotAPalindrome2() throws Exception {
        assertFalse(testObj.isPalindrome("ahahwfniand"));
    }

    @Test
    public void testComplexPalindrome() throws Exception {
        assertTrue(testObj.isPalindrome("kinnikinnik"));
    }
}