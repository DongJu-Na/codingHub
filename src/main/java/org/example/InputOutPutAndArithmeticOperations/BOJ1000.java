package org.example.InputOutPutAndArithmeticOperations;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/1000
* Q 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* I 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
* O 첫째 줄에 A+B를 출력한다.
* EI 1 2
* EO 3
* */
public class BOJ1000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);

    }
}
