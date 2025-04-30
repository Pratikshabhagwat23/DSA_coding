public class assign2 {
    static void bubblesort(int[] arr) {
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int totalswaps = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    totalswaps++;
                }
            }

            count++;

           
            if (totalswaps == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] input1 = {30, 25, 27, 35, 29};
        int[] input2 = {15, 10, 25, 40, 30};

        // Print original arrays
        System.out.println("Original Input 1:");
        for (int i = 0; i < input1.length; i++) {
            System.out.print(input1[i] + " , ");
        }
        System.out.println();

        System.out.println("Original Input 2:");
        for (int i = 0; i < input2.length; i++) {
            System.out.print(input2[i] + " , ");
        }
        System.out.println();

        // Sort arrays
        bubblesort(input1);
        bubblesort(input2);

        // Print sorted arrays
        System.out.println("Sorted Input 1:");
        for (int i = 0; i < input1.length; i++) {
            System.out.print(input1[i] + " , ");
        }
        System.out.println();

        System.out.println("Sorted Input 2:");
        for (int i = 0; i < input2.length; i++) {
            System.out.print(input2[i] + " , ");
        }
        System.out.println();
    }
}
