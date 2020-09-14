package baekjoon2020;

import java.util.Scanner;

//백준 14915 진수 변환기-10진수 m을 입력받아 n진수로 바꾸어 출력
//자바 
public class B14915 {
	static int changeNumber(int m,int n,char[] result) {
		String dChar="0123456789ABCDEF";
		int digits=0;

		do {
			result[digits++]=dChar.charAt(m%n);
			m/=n;
		}while(m!=0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int dno;
		char[] result=new char[32];
		dno=changeNumber(m,n,result);

		for(int i=dno-1;i>=0;i--) {
			System.out.print(result[i]);
		}sc.close();
	}

}
