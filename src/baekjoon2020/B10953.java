package baekjoon2020;

import java.util.Scanner;
//A+B-6 split으로 문자열 나눠서 합 구하기 

public class B10953 {
	
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String[] member=new String[2];
		int[] sum=new int[number];
		
		for(int i=0;i<number;i++) {
			String str=sc.next();
			member=str.split(",",2);
			sum[i]=Integer.parseInt(member[0])+Integer.parseInt(member[1]);
		}
		for(int result:sum) {
			System.out.println(result);
		}
		sc.close();
	}

}
