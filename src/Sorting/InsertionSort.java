package Sorting;

public class InsertionSort {
    static int[] arr = {7, 2, 4, 1, 5, 3};
    static void Sort(){
        for (int i=1; i< arr.length; i++){
            int value = arr[i];
            int hole = i;
            while(hole>0 && arr[hole-1]>value){
                arr[hole] = arr[hole-1];
                hole = hole-1;
            }
            arr[hole] = value;
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Sort();
    }
}
