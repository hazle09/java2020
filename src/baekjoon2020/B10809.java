package baekjoon2020;

import java.util.Scanner;
//백준 10809 자바 풀이
//알파벳 찾기

public class B10809 {

	public static void main(String[] args) {
		//아스키코드를 인덱스로 사용하여 값을 저장할 것이다.
		int[] alpabet=new int[128];
		for(int i=0;i<alpabet.length;i++) {
			alpabet[i]=-1;
		}
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] word=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			//문자를 int로 저장함. 즉 아스키코드값으로 바꿔줌
			int number=word[i];
			if(alpabet[number]==-1) {
			alpabet[number]=i;
			}
		}
		//소문자 a~z까지만 이문제에서 사용되므로 그에 해당하는 인덱스만 값을 출력하게 한다.
		for(int i=97;i<123;i++) {
			System.out.print(alpabet[i]+" ");
		}
sc.close();
	}

}
