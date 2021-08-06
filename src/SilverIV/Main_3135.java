package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3135 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		int[] n_array = new int[n+1];
		for(int i=0; i<n; i++) {
			n_array[i]=Math.abs(B-Integer.parseInt(br.readLine()));
		} // input
		n_array[n_array.length-1] = Math.abs(B-A)-1;
		Arrays.sort(n_array);
		
		System.out.println(n_array[0]+1);

	}
}
