package org.example.basic;

import java.util.Scanner;

public class BOJ1978 {
    /*
    * https://www.acmicpc.net/problem/1978
    * Q 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
    * I 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
    * O 주어진 수들 중 소수의 개수를 출력한다.
    * EI 4 1 3 5 7
    * EO 3
    * */
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 수의 개수 입력
        int count = 0; // 소수의 개수를 저장할 변수

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt(); // 수 입력
            if (isPrime(num)) { // 소수 판별
                count++; // 소수인 경우 count 증가
            }
        }

        System.out.println(count); // 소수의 개수 출력

    }
}
