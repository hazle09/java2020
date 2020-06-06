package baekjoon2020;

import java.util.Scanner;

public class B2522 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();

		for(int j=0;j<number;j++) {
			for(int k=1;k<number-j;k++) {
				System.out.print(" ");
			}
			for(int i=0;i<j+1;i++) {
				System.out.print("*");
			}System.out.println("");
		}
		for(int j=0;j<number;j++) {
			for(int k=0;k<j+1;k++) {
				System.out.print(" ");
				}
			for(int i=1;i<number-j;i++) {
				System.out.print("*");
			}System.out.println("");
		}
		sc.close();
	}
}
