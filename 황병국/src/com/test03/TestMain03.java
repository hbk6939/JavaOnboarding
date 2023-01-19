package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		StringTokenizer st = new StringTokenizer(str);

		// StringTokenizer 이용하여 List에 저장한다.
		List<String> list = new ArrayList<>();

		while (st.hasMoreTokens()) {
			list.add(st.nextToken(","));
		}

		// List에 저장된 데이터의 합과 평균을 구한다.
		double sum = 0, avg = 0;

		for (String s : list) {
			sum += Double.parseDouble(s);
		}

		avg = sum / list.size();

		System.out.printf("합 계 : %.3f\n", Math.round(sum * 1000) / 1000.0);
		System.out.printf("평 균 : %.3f\n", Math.round(avg * 1000) / 1000.0);

	}
}
