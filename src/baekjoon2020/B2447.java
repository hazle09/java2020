package baekjoon2020;

public class B2447 {
	//포기 --

	public static void main(String[] args) {

		int number=3;

		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if((i%3==1&&j%3==1)||(i/3==1&&j/3==1)) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}System.out.println();
		}

	}

}
