package Algorithm;

import java.util.Scanner;

public class C1_q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int n=sc.nextInt();
		int number=n;
		int count=1;
		
		while(n>10) {
			n=n/10;
			count++;
		}
		System.out.println(number+"은 "+count+"자리 수 입니다.");
		
		
	}

}
