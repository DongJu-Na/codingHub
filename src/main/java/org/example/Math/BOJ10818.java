package org.example.Math;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/10818
 * Q 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * I 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 * O 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * EI 5
 *    20 10 35 30 7
 * EO 7 35
 * */
public class BOJ10818 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i =0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[n-1]);


    }
}
