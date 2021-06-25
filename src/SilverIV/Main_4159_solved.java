package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_4159_solved {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int test = Integer.parseInt(br.readLine());
			String result = "POSSIBLE";	
			if((test==0)){
				break;
			} // 0 입력하면 종료
		
		int[] a = new int[test];
		
		for(int i=0; i<test; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(a);
		
		
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i+1]-a[i]<=200) {
				continue;
			} else
				result = "IMPOSSIBLE";
		} // 주유소 거리가 200 이하인지 판단
		
		if( 1422-a[a.length-1] > 100) { // 마지막이 100보단 커야 왕복가능
			result = "IMPOSSIBLE";		
		}
		
		System.out.println(result);
		} // 무한반복문
		
	}
}
