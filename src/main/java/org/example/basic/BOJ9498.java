package org.example.basic;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/9498
 * Q 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * I 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * O 시험 성적을 출력한다.
 * EI 100
 * EO A
 * */
public class BOJ9498 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
            scanner.close();


        if(score>=90) System.out.println("A");
        else if(score>=80) System.out.println("B");
        else if (score>=70) System.out.println("C");
        else if(score>=60) System.out.println("D");
        else System.out.println("F");

    }

}
