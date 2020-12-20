package ProblemSolving;

import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many test case do you want to test");
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            System.out.println("Enter how many number in array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int mul = 1;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                mul = mul * arr[j];
            }
            System.out.println(mul);
        }
    }
}