package baekjoon2020;
import java.util.Scanner;

public class b2443 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		        
		int num=sc.nextInt();
		        
		        for(int i=0;i<num;i++) {
		        	for(int k=0;k<i;k++) {
		        		System.out.print(" ");
		        	}
		        	for(int j=((num-i)*2)-1;j>0;j--) {
		        		System.out.print("*");
		        	}
		        	System.out.println("");
		        } 
		        sc.close();
		    }
		}


