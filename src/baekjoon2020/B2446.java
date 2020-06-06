package baekjoon2020;

import java.util.Scanner;

public class B2446 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int j=number;j>1;j--) {
			for(int k=0;k<(number-j);k++) {
				System.out.print(" ");
			}
			for(int i=(j*2)-1;i>0;i--) {
				System.out.print("*");
			}
			System.out.println("");}
		
		for(int j=number;j>0;j--) {
			for(int k=j-1;k>0;k--) {
				System.out.print(" ");
			}
			for(int i=0;i<(number-j)*2+1;i++) {
				System.out.print("*");
			}
			System.out.println("");}
		sc.close();
	}

}
