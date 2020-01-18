import java.util.Scanner;

class Max3{
    static int min3(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;

        return min;
    }



    public static void main(String[] agrs) {

        System.out.println(min3(3, 2, 4, 1));
    }

}