package bronze.bronze5;

import java.util.Scanner;

class Plus_1000{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.printf("%d",a + b);
    scanner.close();
    }
}