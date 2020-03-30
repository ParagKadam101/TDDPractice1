import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialFinderTest {

    @Test
    void factorialOf0_is1() {
        int output = FactorialFinder.factorial(0);
        assertEquals(1, output);
    }

    @Test
    void factorialOf1_is1() {
        int output = FactorialFinder.factorial(1);
        assertEquals(1, output);
    }

    @Test
    void factorialOf2_is2() {
        assertEquals(2, FactorialFinder.factorial(2));
    }

    @Test
    void factorialOf3_is6() {
        assertEquals(6, FactorialFinder.factorial(3));
    }

}
