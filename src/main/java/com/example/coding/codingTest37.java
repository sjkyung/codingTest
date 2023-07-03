package com.example.coding;

import java.util.Scanner;
public class codingTest37 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int M = in.nextInt();
            int N = in.nextInt();
            int[] A = new int[N + 1]; // 0번째 배열 무시
            for (int i = 2; i <= N; i++) {
                A[i] = i; //배열 초기화 세팅
            }
            for (int i = 2; i <= Math.sqrt(N); i++) { // 제곱근 까지만 수행
                if (A[i] == 0) { // 배열안에 값이 0이면 소수
                    continue; //소수가 아니면 계속
                }
                for (int j = i + i; j <= N; j = j + i) { // 배수 지우기(에라토스테네스의 체)
                    A[j] = 0; //제곱근 비교 후 0으로 변환
                }
            }
            for (int i = M; i <= N; i++) {
                if (A[i] != 0) { // 배열이 안의 값이 0이 아니면
                    System.out.println(A[i]); // 출력
                }
            }
        }
}
