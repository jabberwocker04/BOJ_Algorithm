package Not_Solve;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main_3711_Strange_Quiz {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // TestCase
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine()); // TestCase
			int asdf[] = new int[N];
			int min = Integer.MAX_VALUE; // 나머지중 가장 작은 나머지
			int min_asdf = Integer.MAX_VALUE;
			for(int j=0; j<N; j++) { // 배열(학번) 인풋
				asdf[j] = Integer.parseInt(br.readLine());
				if(min_asdf > asdf[j]) {
					min_asdf = asdf[j];
				}
			} // j<N;
			
			for(int k=1; k<min_asdf; k++) {
				
				if( min > asdf[j] % k && asdf[j] % k >=1 ) {
					min = asdf[j] % k;
				}
			}
			
			
			System.out.println(k);
		}
		
		
		
	}
}
