package baekjoon2020;
//평균은 넘겠지

import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		double[] percent=new double[testcase];
		
		for(int i=0;i<testcase;i++) {
			int students=sc.nextInt();
			int[] arr=new int[students];
			double sum=0;
			double avg=0;
			double number=0;//평균넘는 학생 수
			for(int j=0;j<students;j++) {
				arr[j]=sc.nextInt();//이거 j를 i라고 써놨다가 한시간동안 헤멤 ㅠㅠㅠ 실수 no..........
				sum+=arr[j];
			}
			avg=sum/students;

			for(int k=0;k<students;k++) {
				if(arr[k]>avg) {
					number++;
				}
			}

			double result=(number/students)*100;
			percent[i]=result;

		}
		for(int i=0;i<testcase;i++) {
			System.out.println(String.format("%.3f", percent[i])+"%");
		}
		sc.close();
	}

}
