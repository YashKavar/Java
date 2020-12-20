package ProblemSolving;

public class SumOfArray {
    static int[] arr = {12,13,14,15,16,17};
    static int sum(){
        int temp = 0;
        for (int i=0; i< arr.length; i++){
            temp+=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("Sum of arr is:"+sum());
    }
}
