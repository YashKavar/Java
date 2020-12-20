package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15,16};
        int n = arr.length;
        for (int i=1; i<=n-1; i++) {
            boolean flag = false;
            for (int j = 0; j <= n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        for (int item:arr) {
            System.out.print(item+" ");
        }
    }
}
