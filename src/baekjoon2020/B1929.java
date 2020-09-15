package baekjoon2020;
//m이상 n이하의 소수를 모두 출력하는 프로그램 구하기
//배열 사용

import java.util.Scanner;

public class B1929 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] prime=new int[100000];
		int ptr=0;
		
		//최소 소수 미리 세팅 
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		//홀수만 연산할 예정이기 때문에 m이 짝수라면 홀수로 만들어준다
		if(m%2==0)
			m+=1;
		
		for(int i=5;i<=n;i+=2) {
			boolean flag=false;{
			for(int j=1;prime[j]*prime[j]<=i;j++) {
				if(i%prime[j]==0) {
					flag=true;
					break;
				}
			}
			if(!flag)
				prime[ptr++]=i;
		}
	}
		for(int i=0;i<ptr;i++) {
			if(prime[i]>=m) {
				System.out.println(prime[i]);
			}
		}
		System.out.println("소수의 개수: "+ptr);
sc.close();
	}}
