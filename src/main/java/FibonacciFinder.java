import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonacciFinder {
    public static List<Integer> fibonacciForNumber(int num) {

        if(num == 0)
            return Collections.singletonList(0);
        if(num == 1)
            return Arrays.asList(0,1);

        int first = 0;
        int second = 1;
        int fibo = 0;
        List<Integer> output = new ArrayList<>(Arrays.asList(first, second));

        while(fibo < num) {
            fibo = first + second;
            output.add(fibo);
            first = second;
            second = fibo;
        }

        return output;

    }
}
