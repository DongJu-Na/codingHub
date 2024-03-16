package org.example.basic;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10807
 * Q 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 * I 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 * O 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
 * EI 11
 *    1 4 1 2 4 2 4 2 3 4 4
 *    2
 * EO 3
 * */
public class BOJ10807 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int trueCount = 0;


        for (int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for (int i =0; i < n; i++){
            if(arr[i] == v)
                trueCount++;
        }

        System.out.println(trueCount);
    }
}
