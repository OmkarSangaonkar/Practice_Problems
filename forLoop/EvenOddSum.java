package forLoop;

import java.util.Scanner;

public class EvenOddSum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextInt();
        int ans=0;
        for(int i= 0; i<=number;i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+i;
            }
        }
        System.out.println("total sum is: "+ ans);
    }
}
