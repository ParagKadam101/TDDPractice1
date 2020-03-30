import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciFinderTest {

    @Test
    void fibonacci0_is0() {
        List<Integer> output = FibonacciFinder.fibonacciForNumber(0);
        Integer[] outputArray = new Integer[output.size()];
        output.toArray(outputArray);
        assertArrayEquals(new Integer[]{0}, outputArray);
    }

    @Test
    void fibonacci1_is0And1() {
        List<Integer> output = FibonacciFinder.fibonacciForNumber(1);
        Integer[] outputArray = new Integer[output.size()];
        output.toArray(outputArray);
        assertArrayEquals(new Integer[]{0,1} , outputArray);
    }

    @Test
    void fibonacci2_is0And1And1And2() {
        List<Integer> output = FibonacciFinder.fibonacciForNumber(2);
        Integer[] outputArray = new Integer[output.size()];
        output.toArray(outputArray);
        assertArrayEquals(new Integer[]{0,1,1,2}, outputArray);
    }

    @Test
    void fibonacci8_is0And1And1And2And3And5And8() {
        List<Integer> output = FibonacciFinder.fibonacciForNumber(8);
        Integer[] outputArray = new Integer[output.size()];
        output.toArray(outputArray);
        assertArrayEquals(new Integer[]{0,1,1,2,3,5,8}, outputArray);
    }
}
