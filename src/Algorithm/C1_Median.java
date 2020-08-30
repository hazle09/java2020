package Algorithm;

import java.util.Scanner;
//3개의 정수를 받아 중간값 찾기 
//마찬가지로 경우를 다 if문으로 따져줘야함 

public class C1_Median {
		
		static int med3(int a,int b,int c) {
			if(a>=b)
				if(b>=c)
					return b;
				else if(a<=c)
					return a;
				else
					return c;
			else if(a>c)
				return a;
			else if(b>c)
				return c;
			else
				return b;
		}
		
		public static void main(String[] args) {
			Scanner stdIn=new Scanner(System.in);
			System.out.println("세 수의 중앙값을 구함");
			System.out.println("a의 값: ");
			int a=stdIn.nextInt();
			System.out.println("b의 값: ");
			int b=stdIn.nextInt();
			System.out.println("c의 값: ");
			int c=stdIn.nextInt();
			
			System.out.println("중앙값은 "+med3(a,b,c));
		}

	}


