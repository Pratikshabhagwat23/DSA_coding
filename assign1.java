public class assign1{
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int minindex = i;

            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] input1 = {18,22,20,19,21};
        int[] input2 = {34,12,56,45,23};


        selectionSort(input1);
        selectionSort(input2);

        System.out.print("Sorted Input 1: ");
for (int i = 0; i < input1.length; i++) {
    System.out.print(input1[i] + " ");
}
System.out.println();

System.out.print("Sorted Input 2: ");
for (int i = 0; i < input2.length; i++) {
    System.out.print(input2[i] + " ");
}



    }
}