package baekjoon2020;


class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0;i<a.length;i++) {
        	ans+=a[i];
        }
        return ans;
    }
}


public class B15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println(test.sum(arr));
		
		
		
	}

}
