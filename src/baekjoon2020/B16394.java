package baekjoon2020;
//백준 16394 홍익대학교 문제 _개교 몇주년인지 구하는 문제/ 자바 

import java.util.Scanner;

public class B16394 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=1946;
		int year=sc.nextInt();
		
		int result=year-start;
		System.out.println(result);
	}

}
