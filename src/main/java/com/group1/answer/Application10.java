package com.group1.answer;

import java.util.Scanner;

public class Application10 {
    /*<Enter> 키가 입력될 때까지 문자들을 읽고,
    * 입력된 문자에서 'x' 의 개수를 화면에 출력하라.
    *
    *
    * -- 입력 예시
    * 문자들을 입력하라
    * Hexadecimal x-axe y-axe
    *
    * -- 출력 예시
    * x의 개수는 4
    * */
    public static void main(String[] args) {
        System.out.println("문자들을 입력하라");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('x' == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("x의 개수는 " + count);
    }
}
