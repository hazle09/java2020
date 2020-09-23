package baekjoon2020;
//숫자카드 2 - 백준 10816번
//분류-이진탐색
//해시 배우면 다시 풀어보는 것으로 ^^ 시간이 넘어서 실패함 
//이진탐색으로 이중 for문 푸는 것도 어렵고 해시도 까먹었삼..,,, ㅜㅜ 결과는 잘 나오는데 시간초과 

import java.util.Scanner;

public class B10816 {
	static void binSearch(int n,int m,int[] a,int[] b,int[] r) {
		int count=1;
		int pl=0;
		int pr=n-1;
		int pc;
		for(int i=0;i<m;i++) {
			do{
				pc=(pl+pr)/2;
				if(b[i]==a[pc]) 
					r[i]++;
				pr=pc-1;
	
				
			}while(pr>=pl);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		int[] r=new int[m];
		binSearch(n,m,a,b,r);
		
		for(int i:r)
			System.out.print(i+" ");
		sc.close();
	}

}
