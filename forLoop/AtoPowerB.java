package forLoop;

import java.util.Scanner;

public class AtoPowerB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of base: ");
        int a= sc.nextInt();
        System.out.println("enter value of power: ");
        int b=sc.nextInt();
        int ans=1;

        for( int i=1; i<=b;i++){
            ans=ans*a;
        }
        System.out.println(a + " to the power "+b +" is: "+" "+ans);
    }

}
