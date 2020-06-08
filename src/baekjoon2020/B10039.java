package baekjoon2020;

import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] score=new int[5];
		int input;
		int sum=0;
		for(int i=0;i<5;i++) {
			input=sc.nextInt();
			if(input<40) {
				score[i]=40;
			}else score[i]=input;
			sum+=score[i];
		}
		int result=sum/5;
		System.out.println(result);

		sc.close();
	}

}
