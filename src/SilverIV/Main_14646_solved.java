package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14646_solved {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		int now = 0;
		int a = Integer.parseInt(st.nextToken());
		boolean[] asdf = new boolean[a];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<2*a; i++) {
			int input = Integer.parseInt(st.nextToken())-1;
			if(asdf[input] == true) { // true(스티커도 안붙어있으면)
				asdf[input] = false; // 스티커가 붙은 상태로 만들고
				now = now-1;
			} else {
				asdf[input] = true;
				now = now+1;
			}
			if(max<now) {
				max = now;
			}
		}
		System.out.println(max);
		
		
	}
}
