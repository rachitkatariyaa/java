// this type of conversion is also called a narrow and implicit conversions
// conversion a character into number is also possible in a ASCII values.

import java.util.*;

public class Typecasting {
    public static void main(String[] args) {

        // float into an interger value
        Scanner sc = new Scanner(System.in);
        float a = 18.5f;
        int b = (int) a;

        System.out.println(b);


        System.out.println();
        // character into ASCII value
        char ch = 'a';
        char ch2 = 'b';

        int number = ch;
        int number2 = ch2;

        System.out.println(number);
        System.out.println(number2);


        sc.close();
    }
}
