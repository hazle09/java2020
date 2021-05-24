package baekjoon2020;

public class B4673 {

	static int d(int a) {
		int n1st=a/1000;
		int n2nd=(a%1000)/100;
		int n3rd=(a%100)/10;
		int n4th=a%10;
		return a+n1st+n2nd+n3rd+n4th;
	}

	public static void main(String args[]) {
		boolean check[]=new boolean[10001];
		for(int j=1;j<=10001;j++) {
			if(d(j)<10000)
				check[d(j)]=true;
		}
		for(int i=1;i<10000;i++) {
			if(check[i]==false)
				System.out.println(i);
		}
	}
}


