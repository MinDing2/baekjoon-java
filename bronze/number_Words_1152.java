/*
 * 영어 대소문자 공백으로 이루어진 문자열 주어짐
 * 단어는 공백 한 개로 구분 공백이 연속으로 나오는 경우 x 
 * 공백으로 시작하거나 끝날 수 있다. 
 */
package bronze;

import java.util.*;

public class number_Words_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordNum = scanner.nextLine().trim(); // 앞뒤 공백 제거 
        
        if (wordNum.isEmpty()) { // 입력이 비어있으면 
            System.out.println(0);
        } else {
            String[] words = wordNum.split("\\s+"); // 공백 분할
            System.out.println(words.length);
        }
    }
}