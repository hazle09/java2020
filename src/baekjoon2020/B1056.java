package baekjoon2020;

import java.util.Scanner;

public class B1056 {

	static int IsometricSequence(int num,int length,int[] arr) {
		int count=99;

		if(length<3)
			return num;
		else {
			for(int i=100;i<=num;i++) {
				String str2=Integer.toString(i);
				for(int j=0;j<3;j++) {
					arr[j]=Integer.parseInt(str2.charAt(j)+"");
				}

				if((arr[0]-arr[1])==(arr[1]-arr[2])){
					count++;
				}
			}
			return count;
		}
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int num=Integer.parseInt(str);
		int strLength=str.length();
		int arr[]=new int[strLength];

		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(str.charAt(i)+"");
		}
		System.out.println(IsometricSequence(num,strLength,arr));
		sc.close();
	}
}
