package com.ssafy.yun;

import java.util.Scanner;

public class Baek_8320 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j <= N) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
