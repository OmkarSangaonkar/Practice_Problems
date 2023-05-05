package forLoop;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextInt();
        int ans=0;
        int temp=0;
//        System.out.println(000/10);
        while(number>0){
            temp=number%10;
//            if(temp==0){
//                temp=temp+10;
//            }
            ans =ans*10+temp;
            number=number/10;
        }
        System.out.println("Reversed Number is: " + ans);
    }
}
