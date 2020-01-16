import java.util.Scanner;
import java.lang.Math;

import javax.lang.model.util.ElementScanner6;

class Median{

    static int sumof(int a, int b){

        int tmp = 0;

        // a와 b의 대소 가리기
        if ( a > b ) {
            tmp = a;
            a = b;
            b = tmp;
        }

        // 작은 사이값 포함하기
        a = a-1;
        
        // 1부터 a 혹은 b까지의 합 구하기 
        int sum1 = ((1 + a)*a)/2;
        int sum2 = ((1 + b)*b)/2;

        // 더한값 빼기
        return sum2 - sum1;
    }
    public static void main(String[] agrs) {
    
        // 결과
        System.out.println(sumof(6, 4));
    }

}