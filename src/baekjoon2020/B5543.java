package baekjoon2020;

import java.util.Scanner;

public class B5543 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int burger=2000;
		int soda=2000;
		for(int i=0;i<3;i++) {
			int input=sc.nextInt();
			if(input<burger) {
				burger=input;
			}
		}
		for(int i=0;i<2;i++) {
			int input=sc.nextInt();
			if(input<soda) {
				soda=input;
			}
		}
		System.out.println(burger+soda-50);
		sc.close();
	}

}
