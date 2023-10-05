package com.group1.answer;

import java.util.Scanner;

public class Application6 {
    /* https://codingdojang.com/scode/350?answer_mode=hide
     * 입력값은 양의 정수
     * 예를 들어 10 이라고 하자.
     * 여기서 10 미만 이면서 3과 5의 배수를 구하면
     * 3 5 6 9이다.
     * 이들의 총합은 23
     *
     * 양의 정수를 입력해서
     * 그 양의 정수 미만인 수들 중에
     * 3과 5의 배수의 총합을 구하여라.
     *
     *
     * -- 입력값 --
     * 100
     *
     * -- 출력값 --
     * 2318
     *
     *
     * -- 입력값2 --
     * 10
     *
     * -- 출력값2 --
     * 23
     *
     *
     * -- 입력값3 --
     * 2
     *
     * -- 출력값3 --
     * 0
     *
     *
     * -- 입력값4 --
     * -1
     *
     * -- 출력값4 --
     * 양수 아님
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("양수 아님");
            return;
        }

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
