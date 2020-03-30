public class FactorialFinder {

    public static int factorial(int num) {
        int f = 1;
        int i = 2;
        while(i <= num) {
            f *= i;
            i++;
        }
        return f;
    }
}
