package ProblemSolving;

import java.util.Scanner;

public class PrintElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many test case do you want to test");
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            System.out.println("Enter how many number in array:");
            int n = sc.nextInt();
            System.out.println("Enter which index do you want to print:");
            int e = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j=0; j<n; j++){
                if (j == e) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
