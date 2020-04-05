package baekjoon2020;

import java.util.Scanner;

public class b2445 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int k=(num-i)*2;k>0;k--) { 
				System.out.print(" "); 
				  } 
			for(int j=0;j<i;j++) { 
				System.out.print("*"); 
				  }
			 System.out.println(""); 
			}
		for(int i=1;i<num;i++) {
			for(int j=(num);j>i;j--) {
				System.out.print("*");
			}
			
			  for(int k=1;k<=i*2;k++) { 
				  System.out.print(" "); } 
			  for(int j=(num);j>i;j--) {
			  System.out.print("*"); }
			 
			 System.out.println(""); 
			}
		sc.close();
	}

}
