package com.example.coding;

import java.util.Scanner;
public class codingTest32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //동전의 개수
        int K = sc.nextInt(); //목표금액
        int[] A = new int[N]; //동전 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0; //출력값 초기화
        for (int i = N - 1; i >= 0; i--) { //그리디 알고리즘 구현
            if (A[i] <= K) { // 현재 동전의 가치가 K보다 작거나 같으면 구성에 추가한다.
                count += (K / A[i]); //목표금액 / 현재동전 가치
                K = K % A[i]; // K를 현재 동전을 사용하고 남은 금액으로 업데이트 함
            }
        }
        System.out.println(count);
    }
}