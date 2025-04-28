public class selectionsort{
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};


        for(int i = 0; i<arr.length; i++){
            System.err.println(arr[i] +", ");
        }

        selectionsort(arr);
        
    }

    static void selectionsort(int[] arr){
        int n = arr.length;

        for(int i = 0; i<= arr.length-2; i++){
            int start = i;
            int min = i;
                for(int j = i; j<= n-1; j++){
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                }
               int temp = arr[start];
               arr[start] = arr[min];
               arr[min] = temp; 
        }
    }
}