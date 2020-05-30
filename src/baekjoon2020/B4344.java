package baekjoon2020;
//평균은 넘겠지

import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		double[] percent=new double[testcase];
		
		for(int i=0;i<testcase;i++) {//중첩for문 사용함
			int students=sc.nextInt();
			int[] arr=new int[students];
			double sum=0;
			double avg=0;
			double number=0;//평균넘는 학생 수
			for(int j=0;j<students;j++) {//첫번째 for문은 학생수,각 학생 점수, 평균 계산
				arr[j]=sc.nextInt();//이거 j를 i라고 써놨다가 한시간동안 헤멤 ㅠㅠㅠ 실수 no..........
				sum+=arr[j];
			}
			avg=sum/students;

			for(int k=0;k<students;k++) {//두번째 for문은 평균 점수를 넘는 학생수 카운트
				if(arr[k]>avg) {
					number++;
				}
			}

			double result=(number/students)*100; //평균 넘는 학생수의 퍼센트 비율을 배열에 저장
			percent[i]=result;

		}
		for(int i=0;i<testcase;i++) {
			System.out.println(String.format("%.3f", percent[i])+"%"); //string.format으로 소수점 3째에서 반올림, 출력
		}
		sc.close();
	}

}
