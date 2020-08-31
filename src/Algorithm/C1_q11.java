package Algorithm;

import java.util.Scanner;

public class C1_q11 {
	//양의 정수를 입력하고 자릿수를 출력하는 프로그램 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int n=sc.nextInt();
		int number=n;
		int count=1;
//자릿수를 do-while문을 이용해 제한하기
//			do{
//			n=sc.nextInt();
//			}while(n<10 || n>99); while(!(n<10 || n>99)); 드모르간의 법칙 ㅋ 
		while(n>10) {
			n=n/10;
			count++;
		}
		System.out.println(number+"은 "+count+"자리 수 입니다.");
		
		
	}

}
