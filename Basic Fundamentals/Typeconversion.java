import java.util.*;

public class Typeconversion {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        // long a = sc.nextLong();
        // int b = a;
        // System.out.println(a);

        // this type of conversion is not possible in java beacause,
        // the size of long is smaller than integer that's why we cannot do this type of conversions.

        // byte -> short -> int -> float -> long -> double

        int a = sc.nextInt();
        long b = a;
        System.out.println(b);

        sc.close();
    }
}

