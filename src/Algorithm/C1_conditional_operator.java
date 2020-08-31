package Algorithm;
//조건연산자 ?: 이 계속 헷갈려서 정리

public class C1_conditional_operator {
	public static void main(String args[]) {
		int a,c,x,y;
		x=1;y=2;c=0;
		a=(x>y)?x:y;
		System.out.println((c==0)?"c=0":"c!=0");
	}

}
