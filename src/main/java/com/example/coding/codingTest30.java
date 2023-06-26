package com.example.coding;

import java.util.Scanner;
public class codingTest30 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int start = 0;
            int end = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (start < A[i])
                    start = A[i]; // 레슨 최대값을 시작인덱스로 저장
                end = end + A[i]; // 모든 레슨의 총 합을 종료 인덱스로 저장
            }
            while (start <= end) { //이진 탐색 공식(시작인덱스 < 종료 인덱스 까지)
                int middle = (start + end) / 2;
                int sum = 0;
                int count = 0;
                for (int i = 0; i < N; i++) { // middle값으로 모든 레슨을 저장 할 수 있는지 확인
                    if (sum + A[i] > middle) { // sum과 배열값 최근 값과 > 미들값
                        count++;
                        sum = 0;
                    }
                    sum = sum + A[i]; // sum에 배열값을 합해주면서 비교
                }
                if (sum != 0)// sum이 0이 아니면 마지막 블루레이가 필요
                    count++; //카운트 증가
                if (count > M)// 카운트가 중간 인덱스 값으로 저장 불가
                    start = middle + 1;
                else
                    end = middle - 1;
            }
            System.out.println(start);
        }

}
