package recursion;

public class Factorial {

    // Tail recursion
    public static int factorialTailRecursion(int n, int result) {
        if(n == 0) return result;
        return factorialTailRecursion(n-1, n*result);
    }

    public static int factorialTailRecursion(int n) {
        return factorialTailRecursion(n, 1);
    }

    // Head recursion: might cause stackoverflow error
    public static int factorialHeadRecursion(int n) {
        if(n == 0) return 1;
        return n*factorialHeadRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println("factorialHeadRecursion(3): " + factorialHeadRecursion(3));
        System.out.println("factorialTailRecursion(3): " + factorialTailRecursion(3));
    }
}
