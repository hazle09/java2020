package baekjoon2020;

import java.util.Scanner;

public class b1924 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		String[] arr= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;

		for(int i=0;i<month-1;i++) {
			sum+=days[i];
		}
		sum+=day;
		System.out.println(arr[sum%7]);
		sc.close();
	}

}
