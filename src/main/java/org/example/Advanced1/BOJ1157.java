package org.example.Advanced1;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1157
 * Q 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 * I 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * O 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * EI Mississipi
 * EO ?
 * */
public class BOJ1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase(); // 입력된 단어를 소문자로 변환
        scanner.close();
        int[] counts = new int[26]; // 알파벳 개수를 저장할 배열

        // 단어에서 각 알파벳의 개수를 세어 counts 배열에 저장
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isAlphabetic(ch)) {
                counts[ch - 'a']++;
            }
        }

        int maxCount = 0; // 가장 많이 사용된 알파벳의 개수
        char mostUsedChar = '?'; // 가장 많이 사용된 알파벳을 저장할 변수

        // 가장 많이 사용된 알파벳을 찾음
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostUsedChar = (char) (i + 'a');
            } else if (counts[i] == maxCount) {
                mostUsedChar = '?'; // 여러 개의 최댓값이 있을 때는 '?'로 설정
            }
        }

        System.out.println(Character.toUpperCase(mostUsedChar)); // 결과 출력

    }

}
