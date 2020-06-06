package baekjoon2020;

import java.util.Scanner;

public class b11721 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		char[] arr=str.toCharArray();

		for(int i=0;i<str.length()/10;i++) {
			for(int j=i*10;j<=(i*10+9);j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		for(int i=(str.length()/10)*10;i<str.length();i++) {
			System.out.print(arr[i]);
		}
		sc.close();

	}

}
