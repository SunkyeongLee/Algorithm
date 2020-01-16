import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        int a, b;
    
        // 결과
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값: ");
        a = stdIn.nextInt();
        System.out.println("b의 값: ");
        b = stdIn.nextInt();

        if ( b < a ) {
            do {
                System.out.println("a보다 큰 값을 입력하세요");
                System.out.println("b의 값: ");
                b = stdIn.nextInt();
                
            } while ( a > b );
        }

            System.out.println(b - a);
    }

}