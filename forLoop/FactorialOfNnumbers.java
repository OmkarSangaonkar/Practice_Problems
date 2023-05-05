package forLoop;

import java.util.Scanner;

public class FactorialOfNnumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
            System.out.println("factorial of "+ i +" is: " + fact);
        }
    }
}
