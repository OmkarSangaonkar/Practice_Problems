package bitwise.com;

public class Bitwise {
    public static void main(String[] args) {
        int p=9,q=10;

        System.out.println(p|q); //ans=11   bitwise or operator
        System.out.println(p&q); //ans=4    bitwise and operator
        System.out.println(p^q); //ans=3    bitwise xor operator

        System.out.println(p<<1); //ans=18  left shift operator (simply used to double the value (a * 2 power b))
        System.out.println(p<<2); //ans=36  left shift by two places

        System.out.println(p>>1); //ans=4   right shift operator (used to half value (a/2 power b))
        System.out.println(p>>2); //ans=2   right shift by two places


    }
}
