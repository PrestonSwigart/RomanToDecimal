import static org.junit.Assert.*;
/**
 * testing method
 */
public class RomanToDecimalTest {

    @org.junit.Test
    /**
     * runs tests
     */
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("iv"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("bad input"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("xliv"), 44);
        assertEquals(RomanToDecimal.romanToDecimal("civ"), 104);
        assertEquals(RomanToDecimal.romanToDecimal("xiii"), 13);
        assertEquals(RomanToDecimal.romanToDecimal("julian"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("ryan nobody cares about spotify api"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("LII"), 52);
        assertEquals(RomanToDecimal.romanToDecimal("im running out of ideas to type here"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MD"), 1500);
        assertEquals(RomanToDecimal.romanToDecimal("CLXVI"), 166);
        assertEquals(RomanToDecimal.romanToDecimal("the student store is too expensive"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("CXL"), 140);
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("seventeen"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("apcs"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MMMM"), 4000);
        assertNotEquals(RomanToDecimal.romanToDecimal("contents"), 44);
        assertNotEquals(RomanToDecimal.romanToDecimal("gibberishgqihw"), 77);
    }
}