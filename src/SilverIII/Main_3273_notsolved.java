package SilverIII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3273_notsolved {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // ¿ø¼Ò °¹¼ö
		int[] n_arrays = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			n_arrays[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		
		Arrays.sort(n_arrays);
		int count = 0;
		int j=0;
		
		for(int i=0; i<n; i++) {
			j = Arrays.binarySearch(n_arrays, n_arrays[i]);
			if(j>0 && j!=n_arrays[i]) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}
