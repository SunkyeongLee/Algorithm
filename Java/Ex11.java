import java.util.Scanner;

class Ex11{
    public static void main(String[] args) {
    
        // 결과
        Scanner stdIn = new Scanner(System.in);

        System.out.println("숫자 입력: ");
        String b = stdIn.next();

        int strLen = b.length();
        System.out.println(strLen + "자리 숫자");
    }

}