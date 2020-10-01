package baekjoon2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str[]=bf.readLine().split(" ");
		int n=Integer.parseInt(str[0]);
		IntStack s=new IntStack(n);
		
	    for(int i=0;i<n;i++) {
	    	str=bf.readLine().split(" ");
	    	if(str[0].equals("push"))
	    		s.push(Integer.parseInt(str[1]));
	    	else if(str[0].contentEquals("pop"))
	    		System.out.println(s.pop());
	    	else if(str[0].equals("size"))
	    		System.out.println(s.size());
	    	else if(str[0].equals("empty"))
	    		System.out.println(s.empty());
	    	else
	    		System.out.println(s.top());
	    }
	    
		
		
	}

}

class IntStack {
	private static int ptr;
	private static int max;
	private static int[] stk;
	
	public IntStack(int n) {
		ptr=0;
		max=n;
		stk=new int[n];
	}
	
	static int push(int x) {
		return stk[ptr++]=x;
	}
	
	static int pop() {
		if(ptr>0)
			return stk[--ptr];
		return -1;
	}
	
	static int size() {
		return ptr;
	}
	
	static int empty() {
		if(ptr<=0)
			return 1;
		return 0;
	}
	
	static int top() {
		if(ptr>0)
			return stk[ptr-1];
		return -1;
	}
	
	
}
