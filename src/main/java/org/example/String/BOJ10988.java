package org.example.String;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/10988
* Q 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
*   팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
*   level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
* I 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
* O 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
* EI 1 2
* EO 3
* */
public class BOJ10988 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        StringBuilder compareWord = new StringBuilder();


        for (int i=word.length() - 1;i>= 0;i--){
            compareWord.append(word.charAt(i));
        }


        if(compareWord.toString().equals(word)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}
