public class p4{
    public static void main(String[] args) {
        int number = 1221;
        int original = number;
        int reverse = 0;

        while(number > 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }

        if(original == reverse){
            System.err.println("is palindrome");
        } else{
            System.err.println("not palindrome");
        }
    }
}