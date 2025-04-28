public class Bubblesort{
    static void bubblesort(int[] arr){
        int count = 0;

        for(int i = arr.length-1; i>=0; i--){
            int totalswaps = 0;

            for(int j =0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    totalswaps++;
                }
            }
            // System.err.println(count); 
            count++;

            if(totalswaps == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr =  {14, 9, 15, 12, 6, 8, 13};

     // Print original array
     System.out.println("Original array");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " , ");
        }

        bubblesort(arr);

        System.out.println();
       
        //print sorted array
         System.out.println("Sorted array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " , ");
        }
    }
}