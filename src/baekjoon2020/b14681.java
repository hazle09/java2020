package baekjoon2020;
//간단한 if 문 문제. x와 y좌표를 받아 어느 사분면에 위치하는지 출력. 0은 받지 않음.

import java.util.Scanner;

public class b14681 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//bufferedreader를 사용하면 확연히 코드시간이 줄어든다. 
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int x=Integer.parseInt(br.readLine().trim());
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("1");
		}
		if(x<0&&y>0) {
			System.out.println("2");
		}
		if(x<0&&y<0) {
			System.out.println("3");
		}
		if(x>0&&y<0) {
			System.out.println("4");
		}
		
		//int result = (x > 0 && y > 0)?1:(x < 0 && y>0)?2:(x < 0 && y<0)?3:(x > 0 && y<0)?4:0;
		//이걸 쓰고 싶었는데 할줄 몰라서 못했음 ㅎㅅㅎ
	sc.close();	
	}

}
