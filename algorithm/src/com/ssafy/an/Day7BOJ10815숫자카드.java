package com.ssafy.an;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day7BOJ10815숫자카드 { // 10815번 숫자 카드
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine()); // N개의 카드를 가지고 있음
		int[] cnt = new int[20_000_001];
		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			cnt[10_000_000 + Integer.parseInt(st.nextToken())]++;
		}
		int M = Integer.parseInt(br.readLine()); // M개의 순서대로 몇개 가지고 있는 지
		st = new StringTokenizer(br.readLine());
		for (int m = 0; m < M; m++) {
			if (0 < cnt[10_000_000 + Integer.parseInt(st.nextToken())]) {
				sb.append(1 + " ");
			} else {
				sb.append(0 + " ");				
			}
				
		}

		System.out.println(sb);
		br.close();
	}
}
