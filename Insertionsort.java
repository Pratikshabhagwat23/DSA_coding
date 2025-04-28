public class Insertionsort{
    static void insertionsort(int[] arr){
        for(int i=0; i<=arr.length-1; i++){
            int end = i;
            while(end > 0 && arr[end - 1] > arr[end]){
                int temp = arr[end];
                arr[end] = arr[end - 1];
                arr[end - 1] = temp;
                end--;
            }
        }
    }
            public static void main(String[] args){

                int[] arr = {14, 9, 15, 12, 6, 8, 13};

                System.out.println("Original array");

                for(int i = 0; i<arr.length; i++){
                    System.err.print(arr[i] + ", ");
                }

                insertionsort(arr);
                System.err.println();
                System.out.println("sorted array with insertion");

                for(int i = 0; i<arr.length; i++){
                    System.err.print(arr[i] + " ,");
                }
            }
}