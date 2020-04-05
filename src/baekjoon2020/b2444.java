package baekjoon2020;

import java.util.Scanner;

public class b2444 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=i;j>1;j--) {
				System.out.printf(" ");
			}
			for(int k=0;k<=((num-i)*2-1)+1;k++) {
			System.out.printf("*");
				}
			
			System.out.println("");
		}
		for(int i=num-1;i>0;i--) {
			for(int j=num;j>i;j--) {
			System.out.print(" ");
			}
			for(int k=(2*i-1);k>0;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}sc.close();
	}

}
