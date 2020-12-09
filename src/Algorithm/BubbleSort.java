package Algorithm;
//bubble sort 구현
//어느 특정 시점 이후에 교환이 수행되지 않는 경우, 그 보다 앞쪽의 요소는 이미 정렬을 마친 상태라고 판단, 그 후로는 앞쪽의 요소들을 제외한 연산을 수행하는 알고리즘 개선방식

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a,int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void bubbleSort(int[] a,int n) {
		int k=0;
		while(k<n-1) {
			int last=n-1;
			for(int j=n-1;j>k;j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last=j;
				}
			k=last;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("버블 정렬");
		System.out.println("요솟수: ");
		int nx=sc.nextInt();
		int[] x=new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
			
		}
		
		bubbleSort(x,nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0;i<nx;i++)
			System.out.printf("x["+i+"]="+"%3d\n",x[i]);
	}

}
