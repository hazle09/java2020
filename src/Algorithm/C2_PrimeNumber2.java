package Algorithm;
//배열을 이용해서 소수 찾기 - 소수를 찾을 때마다 배열에 추가, 숫자를 배열의 원소로 나눠서 나눠지면 소수가 아니고 안 나눠지면 소수인 것으로 판별, 배열에 추가함

public class C2_PrimeNumber2 {
	public static void main(String[] args) {
		int counter=0;
		int ptr=0;
		int[] prime=new int[500];
		
		prime[ptr++]=2;
		
		for(int n=3;n<=1000;n+=2) {
			int i;
			for(i=1;i<ptr;i++) {
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr==i)
				prime[ptr++]=n;
		}
		
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수: "+counter);
	}

}
