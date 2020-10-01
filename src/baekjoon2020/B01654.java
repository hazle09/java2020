package baekjoon2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1654 랜선 자르기 자바 풀이
//문제 분류- 이분탐색


public class B01654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=br.readLine().split(" ");
		int K=Integer.parseInt(str[0]),N=Integer.parseInt(str[1]);
		long left=1,right=0,mid=0,tempCount;
		int[] wires=new int[K];

		for(int i=0;i<K;i++) {
			wires[i]=Integer.parseInt(br.readLine());
			right=Math.max(right, wires[i]);
		}
		
		while(left<=right) {
			tempCount=0;
			mid=(left+right)/2;
			for(int i=0;i<K;i++) {
				tempCount+=wires[i]/mid;
				}
			if(tempCount<N)
				right=mid-1;
			else if(tempCount>=N)left=mid+1;

			}
		System.out.println(right);		
		}
		
		
	}


