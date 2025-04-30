public class assign3 {
    static void insertionsort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int end = i;
            while (end > 0 && arr[end - 1] > arr[end]) {
                int temp = arr[end];
                arr[end] = arr[end - 1];
                arr[end - 1] = temp;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[] input1 = {18, 22, 30, 19, 21};
        int[] input2 = {34, 12, 56, 45, 23};

        
        System.out.println("Original Input 1:");
        for (int i = 0; i < input1.length; i++) {
            System.out.print(input1[i] + ", ");
        }
        System.out.println();

        System.out.println("Original Input 2:");
        for (int i = 0; i < input2.length; i++) {
            System.out.print(input2[i] + ", ");
        }
        System.out.println();

        
        insertionsort(input1);
        insertionsort(input2);

        
        System.out.println("Sorted Input 1:");
        for (int i = 0; i < input1.length; i++) {
            System.out.print(input1[i] + ", ");
        }
        System.out.println();

        System.out.println("Sorted Input 2:");
        for (int i = 0; i < input2.length; i++) {
            System.out.print(input2[i] + ", ");
        }
        System.out.println();
    }
}
