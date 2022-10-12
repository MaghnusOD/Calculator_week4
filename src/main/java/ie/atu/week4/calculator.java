package ie.atu.week4;

import java.io.Serial;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        multi();
    }

    public static void multi(){
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for num1: ");
        num1 = sc.nextInt();

        System.out.print("\nEnter value for num2: ");
        num2 = sc.nextInt();

        System.out.println("\nMultiplied value: " + (num1*num2));
    }
}
