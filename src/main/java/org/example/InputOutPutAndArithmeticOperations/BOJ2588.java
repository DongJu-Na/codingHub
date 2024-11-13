package org.example.InputOutPutAndArithmeticOperations;

import java.util.Scanner;

public class BOJ2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        sc.close();
        // - '0' 을 하는 의미는 문자열에 있는 숫자 문자를 실제 숫자로 바꾸기 위한 간단한 방법
        // 아스키표를 보면 이해가 더 잘 됨
        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));



    }

}
