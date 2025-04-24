public class p2 {
    public static void main(String[] args) {
        int N = 1234;  
        System.out.println("Number of digits: " + countDigits(N));
    }

    public static int countDigits(int N) {
        int digits = 0;

       
        if (N == 0) {
            return 1;
        }

       
        while (N > 0) {
            N = N / 10;  
            digits++;    
        }

        return digits;  
    }
}
