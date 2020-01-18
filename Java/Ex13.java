import java.util.Scanner;
import java.util.Random;

class Ex13{

    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] agrs) {

        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
    
        System.out.println("Number of people: ");
        int num = stdIn.nextInt();
        int height = new int[num];
    }

}