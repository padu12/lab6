package Task3;

import Task3.impl.GetNNat;
import Task3.impl.GetNat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int userInt;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the length of the array: ");
        userInt = sc.nextInt();
        int[] arr = new int[userInt];
        for (int i = 0; i<arr.length; i++){
            System.out.printf("Enter the arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Number of natural numbers: " + GetNat.fold(arr));
        System.out.println("Number of not natural numbers: " + GetNNat.fold(arr));
    }
}
