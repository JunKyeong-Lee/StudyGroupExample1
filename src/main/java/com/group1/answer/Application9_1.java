package com.group1.answer;

import java.util.Scanner;

public class Application9_1 {
    /*
     * 소수점을 가지는 5개의 실수를 입력 받아 제일 큰 수를 화면에 출력하라
     *
     * -- 입력 예시
     * 5 개의 실수를 입력하라: 5.2 -2.5 3.4 9.9 7.7
     *
     * -- 출력 예시
     * 제일 큰 수: 9.9
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("5 개의 실수를 입력하라: ");
        double temp = sc.nextDouble();
        double max = temp;

        for (int i = 1; i < 5; i++) {
            temp = sc.nextDouble();
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("제일 큰 수: " + max);
    }
}
