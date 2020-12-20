package Sorting;

public class SelectionSort {
    static int[] arr = {2,7,4,1,5,3};

    static void Sort(){
        for (int i=0; i< arr.length; i++){
            int min = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int k=0; k< arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        Sort();
    }
}
