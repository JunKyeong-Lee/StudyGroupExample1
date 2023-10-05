package com.group1.answer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application5_1 {
    /*
     * 소수 판별
     *
     * 사용자로부터 양의 정수를 입력 받아
     * 그 수가 소수인지 아닌지
     *
     * 입력값은 1보다 큰 자연수로 한정합니다.
     * 이외의 값을 넣으면 프로그램을 종료합니다.
     * (사실 입력값 1을 넣어도 됩니다.)
     *
     * --- 입력값1 ---
     * 5
     * --- 출력값1 ---
     * 소수입니다.
     *
     *
     * --- 입력값2 ---
     * 2
     * --- 출력값2 ---
     * 소수가 아닙니다.
     *
     *
     *
     *
     * --- 특이사항 ---
     * 소수는
     * "1과 자기자신 외에 어떠한 양의 약수도 가지지 않는 양의 정수"
     * "그리고 소수는 약수가 2개만 있어야 한다."
     * 예를 들어 2는 1로 나눠떨어지고 2로 나눠떨어지니깐 소수
     *
     * 24는 1,2,4,6,8,12,24 로 나눠 떨어지니깐
     * 소수가 아닙니다.
     *
     *
     *
     * 위 소수 판별법은 대표적으로 2개 + a가 있지만
     * 하나는 나중에 공부하는거로 하고
     * 하나는 현재 배운 for문으로 할 수 있을겁니다.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("잘못 입력했습니다. 프로그램을 종료합니다.");
            return;
        }

        if (num <= 0) {
            System.out.println("0또는 음수입니다.");
        } else {
            int count = 0;
            for (int i = 1; i <= (int) (Math.sqrt(num)); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("소수입니다.");
            } else {
                System.out.println("소수가 아닙니다.");
            }
        }
    }
}
