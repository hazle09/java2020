package baekjoon2020;
//백준 1978-소수 찾기(소수의 개수 찾기)
//자바
//소수를 싹 찾아서 배열로 만들고 입력받은 수가 배열의 원소와 일치하면 count

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//소수 구하기
		int[] prime=new int[1000];
		int ptr=0;
		prime[ptr++]=2;
		prime[ptr++]=3;
		for(int n=5;n<=1000;n+=2) {
			boolean flag=false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++]=n;
			}
		}
		//입력 받아서 소수 배열과 비교, count증가 
		int n=sc.nextInt();  //몇 개의 수?
		int count=0;
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			for(int j=0;j<ptr;j++) { //prime배열과 비교
				if(num==prime[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
