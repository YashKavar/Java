import java.util.*;

public class TwoPointerAlgo {
    public static boolean triplets(int arr[], int n){
        Arrays.sort(arr);
        for (int i=0; i<n-2; i++){
            if (twoSum(arr, -arr[i], i+1)) return true;
        }
        return false;
    }
    public static boolean twoSum(int a[], int x, int i){
        int j=a.length-1;
        while (i<j){
            if (a[i]+a[j]>x){
                j--;
            }
            else if (a[i]+a[j]<x){
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to enter:");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i=0; i<num; i++){
            System.out.println("Enter "+(i+1)+" number:");
            array[i] = sc.nextInt();
        }
        int no = array.length;
        boolean ans = triplets(array, no);
        if (ans){
            System.out.println("Triplets found.");
        }
        else {
            System.out.println("Triplets not found.");
        }

    }
}
