package baekjoon2020;
//bufferedreader 사용해보기

import java.io.*;

public class B15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int number=Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++) {
			String[] temp=br.readLine().split(" ");//입력 받을 때 띄어쓰기로 구분하니까 split으로 나눠서 저장
			int x=Integer.parseInt(temp[0]);
			int y=Integer.parseInt(temp[1]);
			bw.write(x+y+"\n"); //근데 입력이랑 출력을 같은 for문 안에 넣어도 되는 거였나? 
		}
		
		bw.flush();
		bw.close();
	}

}
