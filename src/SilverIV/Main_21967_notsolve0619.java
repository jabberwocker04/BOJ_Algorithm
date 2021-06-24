package SilverIV;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main_21967_notsolve0619 { // 답에선 LinkedList를 썻음 // 아직 풀지 못했음

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] asdf = new int[N];
		for(int i=0; i<N; i++) {
			asdf[i] = Integer.parseInt(st.nextToken());
		} // 배열에 인풋
		
		int max = 0;
		int count = 0;
		
		if(Math.abs(asdf[0]-asdf[1])<=2) {
			count++;
		}
		
		
		for(int i=1; i<N-1; i++) {
			if(Math.abs(asdf[i]-asdf[i+1])<=2) {
				count++;
			} else {
				count = 0;
			}
			//System.out.println(i+"번째배열인"+asdf[i]+"와count는"+count);
			if(count>max) {
				max = count;
			}
		}
		
		
		if(Math.abs(asdf[N-1]-asdf[N-2]) <= 2) {
			count++;
			if(count>max) {
				max = count;
			}
		}
		//System.out.println(N-1+"번째배열인"+asdf[N-1]+"와count는"+count);
	System.out.println(max);
	}
}
