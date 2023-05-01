package ClassesAndMethods;

import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int output= a+b;
        return output;
    }
}

public class ClassesFirstSum {
    public static void main(String[] args) {
        Algebra obj =new Algebra();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of x: ");
        int x = sc.nextInt();
        System.out.println("enter value of y: ");
        int y= sc.nextInt();
        int sum= obj.add(x,y);
        System.out.println("sum of x and y is : " + sum);
    }
}
