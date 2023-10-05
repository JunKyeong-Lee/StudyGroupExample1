package com.group1.question;

import java.util.Scanner;

public class Application8 {
    /*
    * 키보드로부터 두 개의 정수를 읽어 큰 수를 화면에 출력하라.
    *
    * -- 입력 예시 --
    * 두 수를 입력하라: 10 20
    *
    * -- 출력 예시 --
    * 큰 수: 20
    * */
    public static void main(String[] args) {
        System.out.print("두 수를 입력하라: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("큰 수: " + max);
    }
}
