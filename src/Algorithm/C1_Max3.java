package Algorithm;

//교재-Do it! 내 손으로 직접 코딩하며 확인한다 자료구조와 함께 배우는 알고리즘 입문 자바편 _ 이지스 퍼블리싱 
//휴학 안에 두바퀴 돌리고 동물책으로 넘어가는 것을 목표로 한다 
//동시에 1일1커밋 도전 

public class C1_Max3 {
	
		//1.메서드로 만들어서 호출하는 방법
		static int max3(int a,int b,int c) {
			int max=a;
			if(b>max) max=b;
			if(c>max) max=c;
			return max;
		}
		
		static int max4(int a,int b,int c,int d) {
			int max=a;
			if(b>max) max=b;
			if(c>max) max=c;
			if(d>max) max=d;
			return max;
		}
		
		static int min3(int a,int b,int c) {
			int min=a;
			if(b<min) min=b;
			if(c<min) min=c;
			return min;
			
		}
		
		static int min4(int a,int b,int c,int d) {
			int min=a;
			if(b<min) min=b;
			if(c<min) min=c;
			if(d<min) min=d;
			
			return min;
			
		}
		
		public static void main(String[] args) {
			
			//2.그때그때 입력을 받는 방법 
//			Scanner stdIn=new Scanner(System.in);
//			
//			System.out.println("세 정수의 최댓값을 구합니다.");
//			System.out.println("a의 값: "); int a=stdIn.nextInt();
//			System.out.println("b의 값: "); int b=stdIn.nextInt();
//			System.out.println("c의 값: "); int c=stdIn.nextInt();
//			
//			int max=a;
//			if(b>max) max=b;
//			if(c>max) max=c;
//			
//			System.out.println("최댓값은 "+max+"입니다.");
			System.out.println(max3(3,2,5));
			System.out.println(max4(4,3,6,7));
			System.out.println(min3(4,2,1));
			System.out.println(min4(5,4,3,2));
			
		}

	}


