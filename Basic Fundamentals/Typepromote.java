/*

1. Java Automatically promotes each byte, short, or char operand to int when evaluating an expressions.

2. If one operand is long, float or double the whole expressio is promoted to long, float or double respectively,

that means convert into largest data type in present in program.

*/

// import java.util.*;
public class Typepromote {
    
    public static void main(String args[]){

        /* 
        char a = 'a';
        char b = 'b';

        System.out.println((int)b);
        System.out.println((int)a);
        System.out.println(b-a);
        */


        /* 

        // 1st example 
        short a = 5;
        byte b = 25;
        char c = 'r';

        // byte bt = a + b + c;  not possible due to lossy conversion
        byte bt = (byte) (a + b + c);
        System.out.println(bt);
        */


        /*         
        // 2nd example 
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;

        // int ans = a + b + c + d;

        double ans = a + b + c + d;
        System.out.println(ans);
        */


        // 3rd Example

    }
}

