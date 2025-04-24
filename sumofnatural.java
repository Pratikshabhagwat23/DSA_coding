public class sumofnatural {

    
    public static int findSum(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + findSum(n - 1); 
    }

    public static void main(String[] args) {
        int n = 5; 
        int result = findSum(n);
        System.out.println("The sum is: ");
        System.out.println(result);
    }
}
//  take n = 5 .

//   findSum(5):

//  return 5 + findSum(4) (because n - 1 = 4).

//  findSum(4) 

//  return 4 + findSum(3) (because n - 1 = 3).

//  findSum(3) 

//  return 3 + findSum(2) (because n - 1 = 2).

//  findSum(2) 

//  return 2 + findSum(1) (because n - 1 = 1).

// Finally, findSum(1) is called:

//  base case is n == 1, it returns 1.