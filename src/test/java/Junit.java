import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyTests {
    @Test
    @DisplayName("Test multiplicationOfZero_one")
    public void multiplicationOfZero_one() {
        Features tester = new Features();
        assertEquals(0, tester.multiplicacion(10, 0), "10 x 0 debe ser 0");
    }


    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Features tester = new Features();

        assertEquals(0, tester.multiplicacion(0, 10), "0 x 10 debe ser 0");
        assertEquals(0, tester.multiplicacion(0, 0), "0 x 0 debe ser 0");
    }

    @Test
    @DisplayName("Test Booleano1")
    public void ResultisNullOne() {
        Features tester = new Features();

        // assert statements
        assertFalse(tester.isnull(tester.multiplicacion(10, 5)), "El resultado es True");

    }
    @Test
    @DisplayName("Test Booleano2")
    public void ResultisNullTwo() {
        Features tester = new Features();

        // assert statements
        assertTrue(tester.isnull(tester.multiplicacion(10, 0)), "El resultado es False");

    }


}
