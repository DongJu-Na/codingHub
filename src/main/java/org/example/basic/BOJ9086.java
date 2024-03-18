package org.example.basic;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/9086
 * Q 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 * I 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * O 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 * EI 3
 *    ACDKJFOWIEGHE
 *    O
 *    AB
 * EO AE
 *    OO
 *    AB
 * */
public class BOJ9086 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        for(int i=0; i < testCaseCount; i++){
           String testValue = scanner.next();
           System.out.println(testValue.charAt(0) + "" + testValue.charAt(testValue.length() - 1));
        }
            scanner.close();
    }

}
