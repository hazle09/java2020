package baekjoon2020;

import java.util.Scanner;

public class b10867 {
	//음수까지 처리하려면 어쩔수 없이 자료구조로 hash set가져와야할듯 ........ 아직 안배움.....ㅎㅎㅋㅋ
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		boolean[] arr=new boolean[1000];
		
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			arr[num]=true;
		}
		for(int i=0;i<1000;i++) {
			if(arr[i])
				System.out.print(i+" ");
		}
		sc.close();
	}

}
