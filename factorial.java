public class factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.err.println("the sum is :");
        System.out.println( result);
    }
}
