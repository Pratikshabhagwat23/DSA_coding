public class p1{
   public static void extractionofDigits(int n ){
        

        while(n > 0){
            int reminder = n % 10;
            System.out.println(reminder);
            n = n / 10;
        }
    }
     public static void main(String[] args){
        extractionofDigits(12345);
     }
}