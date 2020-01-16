import java.util.Scanner;

class Practice{

    
    public static void main(String[] args) {
        int[] a = new int[] {5, 3, 200, 6, 7};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }

        System.out.println(max);
        
    }

}