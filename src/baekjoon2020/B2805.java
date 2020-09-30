package baekjoon2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2805 나무자르기 자바 풀이 

public class B2805 {
	public static void main(String[] args) throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String str[]=bf.readLine().split(" ");
	int N=Integer.parseInt(str[0]);
	int M=Integer.parseInt(str[1]);
	long left=0,right=0,mid,tempSum;
	long[] heights=new long[N];
	
	str=bf.readLine().split(" ");
	for(int i=0;i<N;i++) {
		heights[i]=Long.parseLong(str[i]);
		right=Math.max(right, heights[i]);
	}
	
	while(left<=right) {
		tempSum=0;
		mid=(left+right)/2;
		for(int i=0;i<N;i++)
			if(heights[i]>mid)
				tempSum+=heights[i]-mid;
		if(tempSum<M) right=mid-1;	
		else left=mid+1;
		
	}
	System.out.println(right);
	
	}
}
