package com.group1.answer;

import java.util.Scanner;

public class Application9 {
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
        double[] arr = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("5 개의 실수를 입력하라: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        double max = Double.MIN_VALUE;
        for (double x : arr) {
            max = max > x ? max : x;
        }
        System.out.println("제일 큰 수: " + max);
    }
}
