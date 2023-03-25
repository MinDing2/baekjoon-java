
/*
 * 0 ~ 99 범위
 * 주어진 수가 10보다 작으면 ex) 8 -> 08 앞에 0을 붙여 오른쪽에
 * 있는 숫자를 이어 붙여 새로운 수를 만든다
 * 26 -> 2+6 = 8 그 다음 숫자 68 
 * 이게 4번 반복되면 26으로 돌아온다
 * 돌아오는 사이클의 길이를 구하라는 문제 
 */
package bronze;

import java.util.Scanner;

public class plus_Cycle_1110 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int tmp = n;    //대체 값
        int count = 0;
        while(true){
            
           int seatFirst = ((tmp / 10) + (tmp % 10)) % 10;     // 10의 자리값 + 1의 자리 값 에 1의자리 수를 구한 값
        
           int tenPlace = (tmp % 10) * 10;   // 1의 자리 수를 * 10 해서 10의 자리 수 자리를 가짐 
        
           int sum = tenPlace + seatFirst;

           count++; 
            
           if(sum  == n)
           {
             System.out.println(count);
             break;
           }

             tmp = sum;        //tmp 값 갱신.  
        }
        scanner.close();
    }
}
